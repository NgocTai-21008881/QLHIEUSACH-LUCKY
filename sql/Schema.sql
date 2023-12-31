USE [master]
GO
/****** Object:  Database [QuanLyHieuSach]    Script Date: 11/14/2023 2:07:21 PM ******/
CREATE DATABASE [QuanLyHieuSach]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QuanLyHieuSach', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\QuanLyHieuSach.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QuanLyHieuSach_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\QuanLyHieuSach_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [QuanLyHieuSach] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanLyHieuSach].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanLyHieuSach] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [QuanLyHieuSach] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLyHieuSach] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanLyHieuSach] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QuanLyHieuSach] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanLyHieuSach] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QuanLyHieuSach] SET  MULTI_USER 
GO
ALTER DATABASE [QuanLyHieuSach] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanLyHieuSach] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanLyHieuSach] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanLyHieuSach] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QuanLyHieuSach] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QuanLyHieuSach] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [QuanLyHieuSach] SET QUERY_STORE = OFF
GO
USE [QuanLyHieuSach]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 11/14/2023 2:07:21 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[maSP] [nvarchar](10) NOT NULL,
	[maHoaDon] [nvarchar](10) NOT NULL,
	[soLuong] [smallint] NOT NULL,
 CONSTRAINT [PK_ChiTietHoaDon] PRIMARY KEY CLUSTERED 
(
	[maSP] ASC,
	[maHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietPhieuNhap]    Script Date: 11/14/2023 2:07:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietPhieuNhap](
	[maSP] [nvarchar](10) NOT NULL,
	[soLuong] [smallint] NOT NULL,
	[donGiaMua] [money] NOT NULL,
	[maPhieuNhap] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_ChiTietPhieuNhap] PRIMARY KEY CLUSTERED 
(
	[maSP] ASC,
	[maPhieuNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 11/14/2023 2:07:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHoaDon] [nvarchar](10) NOT NULL,
	[ngayLapHD] [date] NOT NULL,
	[maNhanVien] [nvarchar](10) NOT NULL,
	[maKhachHang] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[maHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 11/14/2023 2:07:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKhachHang] [nvarchar](10) NOT NULL,
	[tenKhachHang] [nvarchar](50) NOT NULL,
	[email] [nvarchar](100) NULL,
	[soDienThoai] [nvarchar](20) NULL,
	[gioiTinh] [bit] NOT NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[maKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 11/14/2023 2:07:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[maNCC] [nvarchar](10) NOT NULL,
	[tenNCC] [nvarchar](100) NOT NULL,
	[diaChi] [nvarchar](200) NULL,
	[soDienThoai] [nvarchar](50) NULL,
	[email] [nvarchar](100) NULL,
 CONSTRAINT [PK_NhaCungCap] PRIMARY KEY CLUSTERED 
(
	[maNCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 11/14/2023 2:07:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNhanVien] [nvarchar](10) NOT NULL,
	[tenNhanVien] [nvarchar](100) NOT NULL,
	[soDienThoai] [nvarchar](20) NULL,
	[gioiTinh] [bit] NOT NULL,
	[chucVu] [nvarchar](20) NOT NULL,
	[email] [nvarchar](100) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[maNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaXuatBan]    Script Date: 11/14/2023 2:07:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaXuatBan](
	[maNhaXuatBan] [nvarchar](10) NOT NULL,
	[tenNhaXuatBan] [nvarchar](50) NOT NULL,
	[diaChi] [nvarchar](100) NULL,
	[soDienThoai] [nvarchar](20) NULL,
 CONSTRAINT [PK_NhaXuatBan] PRIMARY KEY CLUSTERED 
(
	[maNhaXuatBan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuNhap]    Script Date: 11/14/2023 2:07:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhap](
	[maPhieuNhap] [nvarchar](10) NOT NULL,
	[ngayNhap] [date] NOT NULL,
 CONSTRAINT [PK_PhieuNhap] PRIMARY KEY CLUSTERED 
(
	[maPhieuNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 11/14/2023 2:07:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[maSP] [nvarchar](10) NOT NULL,
	[tenSP] [nvarchar](200) NOT NULL,
	[maNCC] [nvarchar](10) NOT NULL,
	[soLuongTK] [int] NULL,
	[loaiSP] [nvarchar](20) NOT NULL,
	[donGiaBan] [money] NULL,
	[xuatXu] [nvarchar](20) NULL,
	[mauSac] [nchar](10) NULL,
	[chatLieu] [nvarchar](10) NULL,
	[tacGia] [nvarchar](50) NULL,
	[maNhaXuatBan] [nvarchar](10) NULL,
	[maTheLoai] [nvarchar](10) NULL,
	[loaiBia] [nvarchar](10) NULL,
	[soTrang] [smallint] NULL,
	[hinhAnh] [nvarchar](50) NULL,
	[moTa] [nvarchar](50) NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[maSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 11/14/2023 2:07:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[tenDangNhap] [nvarchar](10) NOT NULL,
	[matKhau] [nvarchar](50) NOT NULL,
	[phanQuyen] [nchar](10) NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[tenDangNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TheLoaiSach]    Script Date: 11/14/2023 2:07:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TheLoaiSach](
	[maTheLoai] [nvarchar](10) NOT NULL,
	[tenTheLoai] [nvarchar](30) NOT NULL,
 CONSTRAINT [PK_TheLoaiSach] PRIMARY KEY CLUSTERED 
(
	[maTheLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_HoaDon] FOREIGN KEY([maHoaDon])
REFERENCES [dbo].[HoaDon] ([maHoaDon])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_HoaDon]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_SanPham] FOREIGN KEY([maSP])
REFERENCES [dbo].[SanPham] ([maSP])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_SanPham]
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuNhap_PhieuNhap] FOREIGN KEY([maPhieuNhap])
REFERENCES [dbo].[PhieuNhap] ([maPhieuNhap])
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap] CHECK CONSTRAINT [FK_ChiTietPhieuNhap_PhieuNhap]
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuNhap_SanPham] FOREIGN KEY([maSP])
REFERENCES [dbo].[SanPham] ([maSP])
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap] CHECK CONSTRAINT [FK_ChiTietPhieuNhap_SanPham]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([maKhachHang])
REFERENCES [dbo].[KhachHang] ([maKhachHang])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([maNhanVien])
REFERENCES [dbo].[NhanVien] ([maNhanVien])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_TaiKhoan] FOREIGN KEY([maNhanVien])
REFERENCES [dbo].[TaiKhoan] ([tenDangNhap])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_TaiKhoan]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_NhaCungCap] FOREIGN KEY([maNCC])
REFERENCES [dbo].[NhaCungCap] ([maNCC])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_NhaCungCap]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_NhaXuatBan] FOREIGN KEY([maNhaXuatBan])
REFERENCES [dbo].[NhaXuatBan] ([maNhaXuatBan])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_NhaXuatBan]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_TheLoaiSach] FOREIGN KEY([maTheLoai])
REFERENCES [dbo].[TheLoaiSach] ([maTheLoai])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_TheLoaiSach]
GO
USE [master]
GO
ALTER DATABASE [QuanLyHieuSach] SET  READ_WRITE 
GO

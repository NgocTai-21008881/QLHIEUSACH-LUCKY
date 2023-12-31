USE [master]
GO
/****** Object:  Database [QuanLyHieuSach]    Script Date: 11/14/2023 9:50:23 PM ******/
CREATE DATABASE [QuanLyHieuSach]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QuanLyHieuSach', FILENAME = N'D:\QLHS\QuanLyHieuSach.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QuanLyHieuSach_log', FILENAME = N'D:\QLHS\QuanLyHieuSach_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
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
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 11/14/2023 9:50:23 PM ******/
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
/****** Object:  Table [dbo].[ChiTietPhieuNhap]    Script Date: 11/14/2023 9:50:23 PM ******/
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
/****** Object:  Table [dbo].[HoaDon]    Script Date: 11/14/2023 9:50:23 PM ******/
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
/****** Object:  Table [dbo].[KhachHang]    Script Date: 11/14/2023 9:50:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKhachHang] [nvarchar](10) NOT NULL,
	[tenKhachHang] [nvarchar](50) NOT NULL,
	[email] [nvarchar](100) NOT NULL,
	[soDienThoai] [nvarchar](20) NOT NULL,
	[gioiTinh] [bit] NOT NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[maKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 11/14/2023 9:50:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[maNCC] [nvarchar](20) NOT NULL,
	[tenNCC] [nvarchar](100) NOT NULL,
	[diaChi] [nvarchar](200) NOT NULL,
 CONSTRAINT [PK_NhaCungCap] PRIMARY KEY CLUSTERED 
(
	[maNCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 11/14/2023 9:50:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNhanVien] [nvarchar](10) NOT NULL,
	[tenNhanVien] [nvarchar](100) NOT NULL,
	[soDienThoai] [nvarchar](20) NOT NULL,
	[gioiTinh] [bit] NOT NULL,
	[chucVu] [nvarchar](20) NOT NULL,
	[email] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[maNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaXuatBan]    Script Date: 11/14/2023 9:50:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaXuatBan](
	[maNhaXuatBan] [nvarchar](20) NOT NULL,
	[tenNhaXuatBan] [nvarchar](50) NOT NULL,
	[diaChi] [nvarchar](100) NOT NULL,
	[soDienThoai] [nvarchar](20) NOT NULL,
 CONSTRAINT [PK_NhaXuatBan] PRIMARY KEY CLUSTERED 
(
	[maNhaXuatBan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuNhap]    Script Date: 11/14/2023 9:50:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhap](
	[maPhieuNhap] [nvarchar](10) NOT NULL,
	[ngayNhap] [date] NOT NULL,
	[maNCC] [nvarchar](20) NOT NULL,
 CONSTRAINT [PK_PhieuNhap] PRIMARY KEY CLUSTERED 
(
	[maPhieuNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 11/14/2023 9:50:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[maSP] [nvarchar](10) NOT NULL,
	[tenSP] [nvarchar](200) NOT NULL,
	[maNCC] [nvarchar](20) NOT NULL,
	[soLuongTK] [int] NULL,
	[loaiSP] [nvarchar](20) NULL,
	[donGiaBan] [money] NULL,
	[xuatXu] [nvarchar](20) NULL,
	[mauSac] [nchar](10) NULL,
	[chatLieu] [nvarchar](10) NULL,
	[tacGia] [nvarchar](50) NULL,
	[maNhaXuatBan] [nvarchar](20) NULL,
	[maTheLoai] [nvarchar](20) NULL,
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
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 11/14/2023 9:50:23 PM ******/
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
/****** Object:  Table [dbo].[TheLoaiSach]    Script Date: 11/14/2023 9:50:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TheLoaiSach](
	[maTheLoai] [nvarchar](20) NOT NULL,
	[tenTheLoai] [nvarchar](30) NOT NULL,
 CONSTRAINT [PK_TheLoaiSach] PRIMARY KEY CLUSTERED 
(
	[maTheLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0001', N'HD00001', 2)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0001', N'HD00003', 2)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0002', N'HD00016', 3)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0003', N'HD00003', 2)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0004', N'HD00004', 1)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0005', N'HD00005', 1)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0006', N'HD00006', 3)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0006', N'HD00014', 3)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0006', N'HD00018', 3)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0007', N'HD00012', 1)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0010', N'HD00009', 2)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0012', N'HD00013', 2)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0014', N'HD00010', 3)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0015', N'HD00012', 1)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0015', N'HD00020', 1)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0016', N'HD00019', 1)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0020', N'HD00001', 3)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0020', N'HD00005', 3)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0021', N'HD00004', 5)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0022', N'HD00011', 2)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'H0022', N'HD00019', 2)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'S0001', N'HD00001', 1)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'S0003', N'HD00007', 1)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'S0003', N'HD00015', 1)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'S0004', N'HD00002', 1)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'S0007', N'HD00008', 1)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'S0007', N'HD00016', 1)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'S0010', N'HD00002', 1)
INSERT [dbo].[ChiTietHoaDon] ([maSP], [maHoaDon], [soLuong]) VALUES (N'S0010', N'HD00017', 2)
GO
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'H0005', 30, 7500.0000, N'PN001')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'H0006', 20, 69000.0000, N'PN002')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'H0015', 15, 13500.0000, N'PN003')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'H0016', 30, 4000.0000, N'PN004')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'H0017', 40, 79000.0000, N'PN005')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'H0018', 50, 30500.0000, N'PN006')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'H0019', 30, 99000.0000, N'PN007')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'H0020', 100, 5500.0000, N'PN002')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'H0021', 100, 5500.0000, N'PN001')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'H0022', 20, 125000.0000, N'PN003')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'H0023', 20, 6500.0000, N'PN004')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'S0007', 10, 106250.0000, N'PN005')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'S0008', 10, 48600.0000, N'PN006')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'S0009', 10, 240300.0000, N'PN007')
INSERT [dbo].[ChiTietPhieuNhap] ([maSP], [soLuong], [donGiaMua], [maPhieuNhap]) VALUES (N'S0010', 10, 100800.0000, N'PN006')
GO
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00001', CAST(N'2023-10-01' AS Date), N'NV001', N'KH0001 ')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00002', CAST(N'2023-10-02' AS Date), N'NV002', N'KH0002 ')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00003', CAST(N'2023-10-03' AS Date), N'NV003', N'KH0003 ')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00004', CAST(N'2023-10-04' AS Date), N'NV003', N'KH0004')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00005', CAST(N'2023-10-05' AS Date), N'NV001', N'KH0005 ')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00006', CAST(N'2023-10-05' AS Date), N'NV002', N'KH0006 ')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00007', CAST(N'2023-10-06' AS Date), N'NV002', N'KH0007 ')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00008', CAST(N'2023-10-07' AS Date), N'NV001', N'KH0008 ')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00009', CAST(N'2023-11-01' AS Date), N'NV005', N'KH0009')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00010', CAST(N'2023-11-02' AS Date), N'NV003', N'KH0010')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00011', CAST(N'2023-11-03' AS Date), N'NV004', N'KH0011')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00012', CAST(N'2023-11-03' AS Date), N'NV001', N'KH0012')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00013', CAST(N'2023-11-04' AS Date), N'NV005', N'KH0013')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00014', CAST(N'2023-11-05' AS Date), N'NV001', N'KH0014')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00015', CAST(N'2023-11-05' AS Date), N'NV004', N'KH0015')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00016', CAST(N'2023-11-06' AS Date), N'NV001', N'KH0016')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00017', CAST(N'2023-11-07' AS Date), N'NV002', N'KH0017')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00018', CAST(N'2023-12-01' AS Date), N'NV003', N'KH0018')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00019', CAST(N'2023-12-02' AS Date), N'NV005', N'KH0019')
INSERT [dbo].[HoaDon] ([maHoaDon], [ngayLapHD], [maNhanVien], [maKhachHang]) VALUES (N'HD00020', CAST(N'2023-12-03' AS Date), N'NV001', N'KH0020')
GO
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0001', N'Nguyễn Văn A', N'hvlt@gmail.com', N'0337098001', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0002', N'Đinh Hoàng Chiến', N'dinhlemy@gmail.com', N'0917798113', 0)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0003', N'Đan Mỹ Chi', N'danmychi@gmail.com', N'0925197741', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0004', N'Nguyễn Văn Tùng', N'nguyenvantung@gmail.com', N'0566920965', 0)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0005', N'Phạm Phương Duy', N'phamphuongduy@gmail.com', N'0919191923', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0006', N'Nguyễn Minh Khuê', N'nguyenminhkhueh@gmail.com', N'0914625893', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0007', N'Bùi Hải Lâm', N'buihailam@gmail.com', N'0912596378', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0008', N'Phạm Thị Hằng Nga', N'phamthihangnga@gmail.com', N'0917458963', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0009', N'Lê Tiến Tâm', N'letientam@gmail.com', N'0912225036', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0010', N'Ngô Ngọc Bích', N'ngobichngoc@gmail.com', N'0915578964', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0011', N'Lê Tuấn Kiệt', N'letuankiet@gmail.com', N'0910236669', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0012', N'Nguyễn Hà My', N'nguyenhamy@gmail.com', N'0911455720', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0013', N'Nguyễn Minh Nghĩa', N'nguyenminhnghia@gmail.com', N'0911555420', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0014', N'Vũ Quang Bách', N'vuquangbach@gmail.com', N'0910233212', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0015', N'Nguyễn Thùy Trang', N'nguyenthuytrang@gmail.com', N'0914747852', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0016', N'Nguyễn Thanh Vân', N'nguyenthanhvan@gmail.com', N'0910211147', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0017', N'Phan Thị Phương Thùy', N'phanthiphuongthuy@gmail.com', N'0911233028', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0018', N'Lê Đức Khánh', N'leduckhanh@gmail.com', N'0917822226', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0019', N'Phan Trung Kiên', N'phantrungkien@gmail.com', N'0914554896', 1)
INSERT [dbo].[KhachHang] ([maKhachHang], [tenKhachHang], [email], [soDienThoai], [gioiTinh]) VALUES (N'KH0020', N'Vương Đình Hào', N'vuongdinhhao@gmail.com', N'0916969632', 1)
GO
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [diaChi]) VALUES (N'NCC01', N'Nhà xuất bản Giáo Dục', N'Số 81 Trần Hưng Đạo, Hoàn Kiếm, Hà Nội')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [diaChi]) VALUES (N'NCC02', N'Cty Phương Nam', N'9A Nhất Chi Mai, Phương 13, Quận Tân Bình, Tp. Hồ Chí Minh')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [diaChi]) VALUES (N'NCC03', N'Phanbook', N'A1-06.04, Tầng 6 Khu Thương Mại Dịch Vụ, Tòa nhà Gold View, 346 Bến Vân Đồn Phường 1 Quận 4 TP.HCM')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [diaChi]) VALUES (N'NCC04', N'Nhã Nam', N'59 Đỗ Quang, phường Trung Hoà, quận Cầu Giấy, Hà Nội')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [diaChi]) VALUES (N'NCC05', N'Cty Văn Hóa & Truyền Thông Trí Việt', N'Số 112 Ngõ 169 Phố Tây Sơn - Phường Quang Trung - Quận Đống đa - Hà Nội')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [diaChi]) VALUES (N'NCC06', N'NXB Tổng Hợp TPHCM', N'62 Nguyễn Thị Minh Khai, Phường Đa Kao, Quận 1, TP.HCM')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [diaChi]) VALUES (N'NCC08', N'Thiên Long', N'Tầng 10, Sofic Tower, Số 10 Đường Mai Chí Thọ, Phường Thủ Thiêm, Thành phố Thủ Đức, Thành phố Hồ Chí Minh, Việt Nam')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [diaChi]) VALUES (N'NCC09', N'MORNING GLORY CORP', N'Hyangnam-eup, Jangan-ro,781-55, Hwaseong-si, Gyeonggi-do, Korea')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [diaChi]) VALUES (N'NCC10', N'Cty VPP Hồng Hà', N'25 Lý Thường Kiệt, P. Phan Chu Trinh, Q. Hoàn Kiếm, TP. Hà Nội')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [diaChi]) VALUES (N'NCC11', N'Cty Giấy Hải Tiến', N'Đường Huỳnh Tấn Phát, KCN Sài Đồng B, Long Biên, Hà Nội')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [diaChi]) VALUES (N'NCC12', N'Vận Tải Quốc Anh', N'591 QL1A, An Lạc, Bình Tân, Thành phố Hồ Chí Minh')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [diaChi]) VALUES (N'NCC13', N'Cty TM Hạnh Thuận', N'Số 43 Đường D4, Khu Him Lam Kênh Tẻ, Phường Tân Hưng, Quận 7, Thành phố Hồ Chí Minh, Việt Nam')
GO
INSERT [dbo].[NhanVien] ([maNhanVien], [tenNhanVien], [soDienThoai], [gioiTinh], [chucVu], [email]) VALUES (N'NV001', N'Trần Anh Bảo', N'0925365361', 1, N'Quản Lý', N'trananhbao@gmail.com')
INSERT [dbo].[NhanVien] ([maNhanVien], [tenNhanVien], [soDienThoai], [gioiTinh], [chucVu], [email]) VALUES (N'NV002', N'Nguyễn Tuấn Anh', N'0925365441', 1, N'Nhân Viên', N'nguyentuananh@gmail.com')
INSERT [dbo].[NhanVien] ([maNhanVien], [tenNhanVien], [soDienThoai], [gioiTinh], [chucVu], [email]) VALUES (N'NV003', N'Đinh Lê Khải', N'0925365112', 1, N'Nhân Viên', N'dinhlekhai@gmail.com
')
INSERT [dbo].[NhanVien] ([maNhanVien], [tenNhanVien], [soDienThoai], [gioiTinh], [chucVu], [email]) VALUES (N'NV004', N'Nguyễn Thảo Mai', N'0924231545', 0, N'Nhân Viên', N'thaomai@gmail.com
')
INSERT [dbo].[NhanVien] ([maNhanVien], [tenNhanVien], [soDienThoai], [gioiTinh], [chucVu], [email]) VALUES (N'NV005', N'Trần Thị Lý', N'0925365112', 0, N'Nhân Viên', N'tranthily@gmail.com
')
INSERT [dbo].[NhanVien] ([maNhanVien], [tenNhanVien], [soDienThoai], [gioiTinh], [chucVu], [email]) VALUES (N'NV006', N'Trần Thị Thanh ', N'0926569984', 0, N'Nhân Viên', N'tranthithanh@gmail.com ')
GO
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB01', N'NXB Giáo Dục Việt Nam', N'Số 81 Trần Hưng Đạo, Hoàn Kiếm, Hà Nội', N'02438220801')
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB02', N'NXB Trẻ', N'157 Lý Chính Thắng, P.Võ Thị Sáu, Quận 3 TP.HCM', N'03839311433')
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB03', N'NXB Kim Đồng', N'Số 55 Quang Trung, Nguyễn Du, Hai Bà Trưng, Hà Nội', N'1900571595')
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB04', N'NXB Đà Nẵng', N'03 đường 30 Tháng 4 P. Hòa Cường Bắc Q.Hải Châu TP. Đà Nẵng', N'0363797869')
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB05', N'NXB Hội Nhà Văn', N'SỐ 65 NGUYỄN DU, QUẬN HAI BÀ TRƯNG, HÀ NỘI', N'0238222135')
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB06', N'NXB Tổng hợp thành phố Hồ Chí Minh', N'62 Nguyễn Thị Minh Khai Phường Đa Kao Quận 1 TP. HCM', N'(028)38256804')
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB07', N'NXB Chính trị quốc gia Sự thật', N'6/86 Duy tân, Cầu Giấy, Hà Nội', N'024 3822 1581')
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB08', N'NXB Phụ nữ Việt Nam', N'39 Hàng Chuối, Quận Hai Bà Trưng, Hà Nội', N'(024) 39710717')
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB09', N'NXB Lao Động', N'175 Giảng Võ, Đống Đa, Hà Nội', N'x')
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB10', N'Nhã Nam', N'59 Đỗ Quang, Cầu Giấy, Hà Nội', N'0903244248')
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB11', N'Đinh Tị Books', N'Nhà NV22 – Khu 12 – Ngõ 13 Lĩnh Nam – P. Mai Động – Q. Hoàng Mai – TP. Hà Nội', N'0247.309.3388')
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB12', N'Đông A', N'113 Đông Các, P. Ô Chợ Dừa, Q. Đống Đa, Hà Nội', N'(024) 3856 9381')
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB13', N'NXB Văn Học', N'18 Nguyễn Trường Tộ - Ba Đình - Hà Nội', N'024.37161518')
INSERT [dbo].[NhaXuatBan] ([maNhaXuatBan], [tenNhaXuatBan], [diaChi], [soDienThoai]) VALUES (N'NXB14', N'NXB Quân Đội Nhân Dân', N'23 Lý Nam Đế, Hoàn Kiếm, Hà Nội', N'024.38455766')
GO
INSERT [dbo].[PhieuNhap] ([maPhieuNhap], [ngayNhap], [maNCC]) VALUES (N'PN001', CAST(N'2022-08-05' AS Date), N'NCC01')
INSERT [dbo].[PhieuNhap] ([maPhieuNhap], [ngayNhap], [maNCC]) VALUES (N'PN002', CAST(N'2023-11-01' AS Date), N'NCC08')
INSERT [dbo].[PhieuNhap] ([maPhieuNhap], [ngayNhap], [maNCC]) VALUES (N'PN003', CAST(N'2023-10-15' AS Date), N'NCC04')
INSERT [dbo].[PhieuNhap] ([maPhieuNhap], [ngayNhap], [maNCC]) VALUES (N'PN004', CAST(N'2023-07-30' AS Date), N'NCC02')
INSERT [dbo].[PhieuNhap] ([maPhieuNhap], [ngayNhap], [maNCC]) VALUES (N'PN005', CAST(N'2023-04-28' AS Date), N'NCC08')
INSERT [dbo].[PhieuNhap] ([maPhieuNhap], [ngayNhap], [maNCC]) VALUES (N'PN006', CAST(N'2023-05-22' AS Date), N'NCC05')
INSERT [dbo].[PhieuNhap] ([maPhieuNhap], [ngayNhap], [maNCC]) VALUES (N'PN007', CAST(N'2023-05-23' AS Date), N'NCC13')
GO
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0001', N'Bút Bi Pro 027 0.5 mm - Thiên Long TL-105 - Mực Đỏ', N'NCC08', 250, N'VPP', 6000.0000, N'Việt Nam', N'Đỏ        ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H1.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0002', N'Bút Lông Bi RB-068 - Mực Xanh - Thân Xanh', N'NCC08', 100, N'VPP', 27000.0000, N'Việt Nam', N'Đen       ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H2.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0003', N'Bút Chì Bấm Bium 0.5 mm - Glory Morning 32000-83449', N'NCC09', 200, N'VPP', 20000.0000, N'Hàn Quốc', N'Trắng     ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H3.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0004', N'Bút Chì Bấm Jedo 0.5 mm - Morning Glory 32000-89422 - Thân Màu Đen', N'NCC09', 100, N'VPP', 50000.0000, N'Hàn Quốc', N'Đen       ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H4.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0005', N'Thước Thẳng 20 cm Disney Winnie The Pooh - Thiên Long SR-033/PO', N'NCC08', 200, N'VPP', 7500.0000, N'Việt Nam', N'Vàng      ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H5.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0006', N'Lốc 5 Tập Kẻ Ngang 80 Trang 70 gsm - Kèm Sticker Ngẫu Nhiên - Hải Tiến 6607', N'NCC11', 100, N'VPP', 69000.0000, N'Việt Nam', N'Vàng      ', N'Giấy', NULL, NULL, NULL, NULL, NULL, N'H6.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0007', N'Bút Dạ Quang - Thiên Long HL-03 -', N'NCC08', 100, N'VPP', 10000.0000, N'Việt Nam', N'Hồng      ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H7.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0008', N'Bút Máy Điểm 10 - Thiên Long TP-FTC09 - Mực Xanh', N'NCC08', 50, N'VPP', 113000.0000, N'Việt Nam', N'Xanh      ', N'Giấy', NULL, NULL, NULL, NULL, NULL, N'H8.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0009', N'Bút Gel Quick Dry 0.5 mm - Thiên Long GEL-033 - Mực Xanh', N'NCC08', 200, N'VPP', 12500.0000, N'Việt Nam', N'Xanh      ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H9.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0010', N'Bút Bi Laris TL-095', N'NCC08', 200, N'VPP', 10000.0000, N'Việt Nam', N'Đỏ        ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H10.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0011', N'Bộ 5 Tập học sinh 96 trang 4 ô ly vuông 60 gsm Điểm 10 TP-NB039', N'NCC08', 200, N'VPP', 55000.0000, N'Việt Nam', N'Đỏ        ', N'Giấy', NULL, NULL, NULL, NULL, NULL, N'H11.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0012', N'Bút Lông Bảng - Hồng Hà GX-WM01', N'NCC10', 100, N'VPP', 7500.0000, N'Việt Nam', N'Xanh      ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H12.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0013', N'Bút Chì Gỗ 4B Có Tẩy Exam', N'NCC10', 200, N'VPP', 3500.0000, N'Việt Nam', N'Cam       ', N'Gỗ', NULL, NULL, NULL, NULL, NULL, N'H13.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0014', N'Sổ Lò Xo A6 Kẻ Ngang 200 Trang 70gsm Let''S Fly', N'NCC10', 100, N'VPP', 16000.0000, N'Việt Nam', N'Trắng     ', N'Giấy', NULL, NULL, NULL, NULL, NULL, N'H14.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0015', N'Bút Xóa 12 ml 6677', N'NCC10', 100, N'VPP', 13500.0000, N'Việt Nam', N'Xanh      ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H15.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0016', N'Bút Chì Gỗ HB Eco Hồng Hà 3494', N'NCC10', 100, N'VPP', 4000.0000, N'Việt Nam', N'Be        ', N'Gỗ', NULL, NULL, NULL, NULL, NULL, N'H16.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0017', N'Bìa 5 Ngăn - Morning Glory 79158', N'NCC09', 50, N'VPP', 79000.0000, N'Hàn Quốc', N'Đen       ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H17.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0018', N'Bút Vẽ Kỹ Thuật Brush Tip - Marvy 4600-1', N'NCC12', 50, N'VPP', 30500.0000, N'Nhật Bản', N'Trắng     ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H18.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0019', N'Bộ 2 Bút Cọ Nước - Marvy 40F/M-S', N'NCC12', 50, N'VPP', 99000.0000, N'Nhật Bản', N'Trắng     ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H19.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0020', N'Bút Bi 0.5 mm Thiên Long TL-027 Mực Xanh', N'NCC08', 300, N'VPP', 5500.0000, N'Việt Nam', N'Xanh      ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H20.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0021', N'Bút Bi 0.5 mm Thiên Long TL-027 Mực Đỏ', N'NCC08', 300, N'VPP', 5500.0000, N'Việt Nam', N'Đỏ        ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H21.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0022', N'Bút Bi Zero No 38 - Mực Xanh', N'NCC13', 200, N'VPP', 125000.0000, N'Hàn Quốc', N'Đỏ        ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H22.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'H0023', N'Bút Bi Xóa Được - Mực Xanh', N'NCC13', 100, N'VPP', 6500.0000, N'Trung Quốc', N'Đỏ        ', N'Nhựa', NULL, NULL, NULL, NULL, NULL, N'H23.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'S0001', N'Toán Lớp 1', N'NCC01', 25, N'Sách', 28000.0000, NULL, NULL, NULL, N'Nhiều Tác Gỉa', N'NXB01', N'TL001', N'28000', NULL, N'SGK01-Toan1.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'S0002', N'Tiếng Anh 2', N'NCC02', 50, N'Sách', 52000.0000, NULL, NULL, NULL, N'Nhiều Tác Gỉa', N'NXB01', N'TL001', N'52000', NULL, N'SGK02-TiengAnh12.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'S0003', N'Ký Ức Theo Dòng', N'NCC03', 15, N'Sách', 185300.0000, NULL, NULL, NULL, N'Phan Chánh Dưỡng', N'NXB04', N'TL003', N'185300', NULL, N'SK03-KyUcTheoDongDoi.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'S0004', N'Tiếng Anh 12', N'NCC01', 20, N'Sách', 17000.0000, NULL, NULL, NULL, N'Bộ Giáo Dục Và Đào Tạo', N'NXB01', N'TL001', N'17000', NULL, N'SGK02-TiengAnh12.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'S0005', N'Sinh Học 11', N'NCC01', 15, N'Sách', 27000.0000, NULL, NULL, NULL, N'Nhiều Tác Giả', N'NXB01', N'TL001', N'27000', NULL, N'SGK03-SinhHoc11.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'S0006', N'Toán 10- Tập 1', N'NCC01', 20, N'Sách', 17000.0000, NULL, NULL, NULL, N'Nhiều Tác Gỉa', N'NXB01', N'TL001', N'17000', NULL, N'SGK04-Toan10T1.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'S0007', N'Bắc Hành Lược Ký', N'NCC04', 15, N'Sách', 106250.0000, NULL, NULL, NULL, N'Lê Quýnh', N'NXB05', N'TL004', N'106250', NULL, N'SK02-BacHanhLuocKi.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'S0008', N'Bác Hồ Với Thiếu Niên Nhi Đồng', N'NCC05', 25, N'Sách', 48600.0000, NULL, NULL, NULL, N'Tuệ Minh', N'NXB13', N'TL011', N'48600', NULL, N'SK01-BacHoVoiThieuNienNhiDong.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'S0009', N'Người Thầy', N'NCC06', 20, N'Sách', 240300.0000, NULL, NULL, NULL, N'Nguyễn Chí Vịnh', N'NXB14', N'TL011', N'240300', NULL, N'SK01-BacHoVoiThieuNienNhiDong.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'S0010', N'Muôn Kiếp Nhân Sinh - Many Times, Many Lives', N'NCC06', 20, N'Sách', 100800.0000, NULL, NULL, NULL, N'Nguyên Phong', N'NXB06', N'TL010', N'100800', NULL, N'SK04-MuonKiepNhanSinh.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'S0011', N'Toán 2', N'NCC01', 25, NULL, 35000.0000, NULL, NULL, NULL, N'Nhiều Tác Gỉa', N'NXB01', N'TL001', NULL, NULL, N'SGK05-Toan2.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'S0012', N'Toán 3 Tập 2', N'NCC01', 15, NULL, 35000.0000, NULL, NULL, NULL, N'Nhiều Tác Gỉa', N'NXB01', N'TL001', NULL, NULL, N'SGK06-Toan3Tap2.jpg', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [maNCC], [soLuongTK], [loaiSP], [donGiaBan], [xuatXu], [mauSac], [chatLieu], [tacGia], [maNhaXuatBan], [maTheLoai], [loaiBia], [soTrang], [hinhAnh], [moTa]) VALUES (N'S0013', N'Toán 11', N'NCC01', 25, NULL, 30000.0000, NULL, NULL, NULL, N'Nhiều Tác Gỉa', N'NXB01', N'TL001', NULL, NULL, N'SGK04-Toan10T1.jpg', NULL)
GO
INSERT [dbo].[TaiKhoan] ([tenDangNhap], [matKhau], [phanQuyen]) VALUES (N'NV001', N'admin', N'QL        ')
INSERT [dbo].[TaiKhoan] ([tenDangNhap], [matKhau], [phanQuyen]) VALUES (N'NV002', N'123', N'NV        ')
INSERT [dbo].[TaiKhoan] ([tenDangNhap], [matKhau], [phanQuyen]) VALUES (N'NV003', N'123', N'NV        ')
INSERT [dbo].[TaiKhoan] ([tenDangNhap], [matKhau], [phanQuyen]) VALUES (N'NV004', N'123', N'NV        ')
INSERT [dbo].[TaiKhoan] ([tenDangNhap], [matKhau], [phanQuyen]) VALUES (N'NV005', N'123', N'NV        ')
INSERT [dbo].[TaiKhoan] ([tenDangNhap], [matKhau], [phanQuyen]) VALUES (N'NV006', N'123', N'NV        ')
GO
INSERT [dbo].[TheLoaiSach] ([maTheLoai], [tenTheLoai]) VALUES (N'TL001', N'Giáo khoa')
INSERT [dbo].[TheLoaiSach] ([maTheLoai], [tenTheLoai]) VALUES (N'TL002', N'Sách thiếu nhi')
INSERT [dbo].[TheLoaiSach] ([maTheLoai], [tenTheLoai]) VALUES (N'TL003', N'Kinh tế')
INSERT [dbo].[TheLoaiSach] ([maTheLoai], [tenTheLoai]) VALUES (N'TL004', N'Chính trị')
INSERT [dbo].[TheLoaiSach] ([maTheLoai], [tenTheLoai]) VALUES (N'TL005', N'Tiểu thuyết')
INSERT [dbo].[TheLoaiSach] ([maTheLoai], [tenTheLoai]) VALUES (N'TL006', N'Quản trị-lãnh đạo')
INSERT [dbo].[TheLoaiSach] ([maTheLoai], [tenTheLoai]) VALUES (N'TL007', N'Marketing-Bán hàng')
INSERT [dbo].[TheLoaiSach] ([maTheLoai], [tenTheLoai]) VALUES (N'TL008', N'Phân tích kinh tế')
INSERT [dbo].[TheLoaiSach] ([maTheLoai], [tenTheLoai]) VALUES (N'TL009', N'Kỹ năng sống')
INSERT [dbo].[TheLoaiSach] ([maTheLoai], [tenTheLoai]) VALUES (N'TL010', N'Tâm lý')
INSERT [dbo].[TheLoaiSach] ([maTheLoai], [tenTheLoai]) VALUES (N'TL011', N'Câu chuyện cuộc đời')
INSERT [dbo].[TheLoaiSach] ([maTheLoai], [tenTheLoai]) VALUES (N'TL012', N'Lịch sử')
INSERT [dbo].[TheLoaiSach] ([maTheLoai], [tenTheLoai]) VALUES (N'TL013', N'Nghệ thuật-Giải trí')
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
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_NhaCungCap1] FOREIGN KEY([maNCC])
REFERENCES [dbo].[NhaCungCap] ([maNCC])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_NhaCungCap1]
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

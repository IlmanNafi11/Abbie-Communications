-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2024 at 10:27 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `abbie_communication`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `id_akun` char(14) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(40) NOT NULL,
  `id_user` char(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`id_akun`, `username`, `password`, `id_user`) VALUES
('0008230618', 'azka', '7c222fb2927d828af22f592134e8932480637c0d', 'USR2018'),
('0008230979', 'ilman', '7c222fb2927d828af22f592134e8932480637c0d', 'USR6816');

-- --------------------------------------------------------

--
-- Table structure for table `data_pengguna`
--

CREATE TABLE `data_pengguna` (
  `id_user` char(7) NOT NULL,
  `nik` char(16) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `noHp` char(13) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `posisi` char(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_pengguna`
--

INSERT INTO `data_pengguna` (`id_user`, `nik`, `nama`, `noHp`, `alamat`, `posisi`) VALUES
('USR2018', '3314123567865432', 'azka', '085674567432', 'baron', 'admin'),
('USR6816', '3314356743452785', 'ilman nafian', '085234523466', 'nganjuk', 'owner');

-- --------------------------------------------------------

--
-- Table structure for table `detail_transaksi_diskon`
--

CREATE TABLE `detail_transaksi_diskon` (
  `id_transaksi` char(11) DEFAULT NULL,
  `kode_diskon` char(9) DEFAULT NULL,
  `total_diskon` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `detail_transaksi_diskon`
--

INSERT INTO `detail_transaksi_diskon` (`id_transaksi`, `kode_diskon`, `total_diskon`) VALUES
('89755823645', 'DSC5301', 6000);

-- --------------------------------------------------------

--
-- Table structure for table `laporan`
--

CREATE TABLE `laporan` (
  `id_laporan` int(7) NOT NULL,
  `tanggal` date NOT NULL,
  `pemasukan_penjualan` int(10) NOT NULL,
  `pemasukan_service` int(10) NOT NULL,
  `jumlah_pengeluaran` int(10) NOT NULL,
  `id_user` char(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `laporan`
--

INSERT INTO `laporan` (`id_laporan`, `tanggal`, `pemasukan_penjualan`, `pemasukan_service`, `jumlah_pengeluaran`, `id_user`) VALUES
(877090, '2024-05-16', 145000, 25000, 2500000, 'USR6816'),
(877091, '2024-05-14', 0, 0, 1225000, 'USR6816'),
(877092, '2024-03-31', 0, 0, 50000, 'USR6816');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id_member` char(10) NOT NULL,
  `nama_member` varchar(25) NOT NULL,
  `tlp_member` char(13) NOT NULL,
  `alamat_member` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id_member`, `nama_member`, `tlp_member`, `alamat_member`) VALUES
('MBR1749', 'april', '081234567890', 'nganjuk'),
('MBR1750', 'nana', '086456234323', 'sragen'),
('MBR7538', 'ilman', '085678564321', 'sragen'),
('MBR9883', 'azka', '086543567543', 'nganjuk');

-- --------------------------------------------------------

--
-- Table structure for table `produk`
--

CREATE TABLE `produk` (
  `id_produk` char(13) NOT NULL,
  `nama_produk` varchar(35) NOT NULL,
  `kategori` varchar(30) NOT NULL,
  `jumlah` int(5) NOT NULL,
  `harga` int(10) NOT NULL,
  `id_supplier` char(7) NOT NULL,
  `barcode` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `produk`
--

INSERT INTO `produk` (`id_produk`, `nama_produk`, `kategori`, `jumlah`, `harga`, `id_supplier`, `barcode`) VALUES
('411891389826', 'kabel otg', 'Electronic', 13, 15000, 'SPE7604', 0x47494638396159015700f00000000000ffffff2c00000000590157004008ff0003081c48b0a0c1830201281ca81080c1860d1f2e4c08d161c18a160360648871e2c1881421721479b1e2488404416af4a852e549841d597a7c99726649922b71d27409536646942d6da21c4ab4a8d1a03f43f2cc3972e946a53e9f7e8c4a35694ea445b186a4c9f5a654a7429736ad2a31a3d89b5da79a156ab4addbac3ecb825dab132a5da452cb8ebd1bd6e456a25a99fead69756fe0b467af92453b18685cc08fdf4a9eac16b15fc27be52e565c17b3ddcc5e233ba6bbb36f61bb871bab268cd7745abdab610ba64c9b726aceb2f37edecd39716bbe56bfb2653cfbb6ef9896830fc7cdbbf469cfb347bfae4d7da8f1cbcee7fe36bc7c7b73de899d8bff27ae19e75cd9e541430f3f987df1e5d5e3af377dfe3bf3fb319f7bbfafde7de0ebfa21b75a7d6aed379e75a2f5449a7c0c2a981c81bae177597ed281879d85cf1d08e068c229e721879b1d5861740ec6d62083004278a184e609581986da25f8e27b0b4257de86e485065c6ef0b5d7238d270629a290441659e46d4626a9646d482e0954424e52175c4a0c71a411951f45a9657c6659695197585e09a598646e69668329ba665f87bf1db7e39a13fef89f8c6e76889e892caa98a18f7b0279a664697e08678b8446985d8818c255238e05c629a88d3aaa37e48cfec9f82764354aca678c6ff6d6dd6611da89a9866a364ae89d24b286a89f08665a62aa97b6fffa60a9a13adae6a79dd67aeaa87c2607e2ae90c20a23ad725a4a9c7bb14eaaaba67956e5667f2b8a2a6baf03e22aadaf0a1a48edb4c2ced767b2db32ab6db3c03d3bac874d7aabacb58ea25ae7aae94ecae3b7e0063a2fa7d07634229bf419ab6eb8785258eda3e90d3addbfdc225b2f9dd1c26babb3b8e68b2f9ea4badaadc0a91258307f00535aacc5e07a8c2eb19df15b6ec4e76e5ce9a20c07a8efc0a84a4cb2a207cbbb70c8089614e6975552b433ce408f29269844f75cb4d04127adf4d24c37edf4d380b6ace7c4e49a4baeca1f571c336a2d6f7df5b15953dcf1d2f6825df2c327bb2cf3c8209bbdaecbd7c29cadc36d23bcef8f2197ed2dd5265bff6d32d67dce69f1bbc0626baab8feda6c77d37a1fcaf6da7ea30d38cddb6aac23a307ffed36afdd2a1e74e39bf69bab8bf7d21d6fe55dcf5db8dc871b2c36ab77d39b2ce834f28d76e4858a5e33ea83b3bb7ac6be235eb7e7632b4dfbb89a7baa76ca91be2eb8e137a61eecdaf352de79f1491f6f3aa8a49b8d7cbb9c3f9fa3aabf5b4ebef0bbc3feaac2b34b4db2edb977e6b8f0a7b38af9e5d2672ef9e609877d3dcedaeb14f5b8b6bcaf9dcf7991b91ff9144838f4217078d8fb9cfb1ea5abfd60ac74024c54f81258aae8f58e60cde398fa44663df6c52a80f4e3decb44f6bddf55af63846360f05cf7bffad52f6f13c420e06e55c0e4e5ab841c04e102fff317b0fd2d8e841b94dd0973e83ddd9d0b772db46110a187bf0f7acd8711cce208c9c6c4bd39b16a2833e00f93f8b65fc9106e744b9f142108c02ece2f847d0b23165904449609913b561cdf008ff8c2fe29f152281c9405bbe7c50cd2918c30f4dd197fe5c01a264e8b386423d49e76c34932ee916d94a4259956c94d1a0f936672c81fcf34a59e0dcd94650a93279574b453226d4ca2ec12de5629a45186f2213f23d34f76894a5a1ec968c0145a525a694b5f1af398c84ca63251e4c6d03dee897234e218fd5846d52d52758d5c991a41b9b00f4eed8b71eca1343548cd44a2b17c1d8463c3d8b8c6f4457256145ce72057a8434162527cc03be7355b27ffc2763ed09ddd84673d0f084671c66f72881c610c8978b1716e917fb19b6420fb69c40b36d1907143a24215c9d006d2509bff7cdd3b07f6cd6716347651bce71459e7412a36f4a0105d9fff4c08c866d60e9cb78b264c090a52fba57388799c1ef3f818538d3a6da21554a1a19c994276ae349f66ece80c29ead4aa02b47dde7c1f4ee307c5ed599577577491f93c4ad56d7ef57f23cd674977083183a6f4acf8d4df0ac73ad56585d4919ac4aa402fcad6b4a1d4ab66d59a1e09e852b2da15af8115694049aa559386f3af18055f3937aa4fa99e339b33cd6c31b78454792a75456fa4aa3f7d7a47c2b2b4883b25de43899a3d9bbe15723a7ded5de38ada8cff9a6f8faa1d2d4dffd4d9b3edd4a2856c6a62491bd6b9fed4b0eb1c6e4f774b4ad702169a6e7d2e62c13a58e515b6aec99dad6625eadcc8fe9690a14d2a5c9f2a57dbfe14b75ad4ed2cf5cad878fa769e4bbda977d56bc7e29ab7b4624caf4af3bac4acba177e3c84ac70b55bdfea628cae97fde876137ad4ee0ef8a4324d2d39236acea806b5bc6924701db9ebdf81ee11b8e1f5ec780b2c54eb9ef6a52d54ee8229e9607b8e8e9e7c75b18a498c6174e2778ef4dd30d47a0be0b60a58c61aaeb0352dcb4805076ebf57edef5e83ab4eaec656bacb256f6d25eb52f4ae36b7dc64af5a1bdb573cfe58b448a66e890f7c5cecfa76c63a66718763ccd39c4677ffbe6126ae81c55ae6049735c8936df09a99dc6627bff9c151a6f1946d6cdf0c4ff7d0cc0d658bc1fce2f8c277ab6956a0974f8cdc33e399c26a5e72683f0c5ea60219d1524631954f6ce51c33f8927bdef45041ec6946a359c8a6da67978bda474ceb59d3ade6348cf92cde5753d6c2d7b5f361039de65bb7d7c3abeeb47c01bd62499b16aa7396f095f5cbdf9aa63ad7c9de7588df1b67da8a9ad0d14ef1a523cc615c2fbbc9018eb06c412de86fcb1add333bb551519de4652abadaf6d6522795acd87cdfbbdefe76d2bead0df080b332cb061738c2f5bd635cda8827c35c6fc2b9151d97587c26899ef8548e5a2651e6b268a7d9acc689294c879752e328484a25d91cbe139ff572252897124b5c9e312b0d8d6731a70d683fc7725df63ce4399f0c98b034f48e0753e5417f8bc805def38adb24e24b1f39c6a7ce17ae643ce958cfbad6271910003b),
('529869193099', 'kartu telkomsel 1 gb', 'Phone credit/Internet credit', 13, 20000, 'SPC7412', 0x47494638396159015700f00000000000ffffff2c00000000590157004008ff0003081c48b0a0c1830201281ca81080c1860f1b2e2c0831a1448908035424b8b1e3c58f193d62b43892e345861335a6fc2832a2c38c2451b2742913644c8a2c5faad429b327cc9d3e7f0a1d4a14614b9c3c496e0c9a33a949a74777360db9f2a4d29435abea1469132852a15cad3ecd5a72e9d5b2586f7a8519b5a8dbb754b7a65d4b96e659b363bfaa6d8a97a9d8ae75f76aed8ab7af5ea962fdce544bb6ad60a776e9c29d3cd9b164c45007273eacb8f1e6bc98033f8d1a166d66c887a7a6ce19d4b3dcd3ad8d6aa54cbbf26cce6723ab3e58f83666c0ab4df736ad98f05cc3a07717ff7b9c35e3c7607dd79e1efd7564d1cb4b5e877ef77376ecb9b9ffff96fe9cb766ed8f8d9f56af7b6e7bd4d4e377c61d3a3870d0f3c7a34fce7c3ffbf4fd6d67de6bf79566d96ec3c536a082f235b856824841a85f5cefb9865c69e0d5f7e07907ba67df6706923761799655e8e089e2295820871e5e461a5ff06118de68be85681d7defad48608011f2c81f7cf9a1d86089421669a47c441ea9e4926e25c9245b4fd2c6d3422f6d9510432869c451945cc647e5435786a992961691696597680e29e270122a47df8b7c5138a38e70baa6628bd9b5e99c8b7bea09648a690ed5e17acdedb8df9d37ea77e17919feb7e1627cfef9a88e7692d867a10c061768936b16eae77d88e6e91d8086ba5467778966fa23a5a822ea6890b2a5ffbae94f839a8a69abb19aa8688b326a281a9caf969723882cca3a62a4aac23aab9cc8f6081bae0b6a8aeaa2a5cef86b8d973ecb56b1c312e76cadc24abb2cad9d12aaad9bf88907638c8c5a3b27b6904ac82cba36baeaa3b2ba8e3befad349ebba780c0fefb61b5fde68720bffb422aaab107fb2ba993fa3e0a30b18652abebba09f77a6da20d0bd8eda7f742eb6775c9460c6ec1035b2c2ec6b9beeb9f8ff55afa30b729971bacc4e41abbaca43b6349a6993e9f79e6981117fd739541271da6d03e1bedf4d350472df5d4546fcbb0a7fca21b2aa9a092da28cc34376b75a5ab867cecc83997acefc95f57cc6bd6c5aaac219df0922d6fcbc72e6cafb73f92ff1caed16cbb3be9a862db28b77a6cd62d32c278d31b76e27ce32baed481fbcaf5db0e5b88f9c6901b9cadc7353b7c73c793378ea7c9e5da2a3ae168efca2ec17473fc38e3d1e67df9d5f1c23db3ce4e57ceaaede9e2ec7ac6eda22c3ce9c17facfbe89f975e3b7245fb4e31d913cb1ea7e9c2616dbdddb42bbf7ae48b679ef6dfd1a7eeacf7cc7a7efdf3fd75ae6ef3c9878ebeccccf3de37d5d2bfecf6eb17c3483cc11bd39bccfc06bc9845aa7e6a83d8dacc673c01d64e7d5af39ae01c65c0bbb14f61b7dbdbc9a00728a8e50f64871ae0ed0ed73eed41d06c1c1c9cfeb867ae0d9e4e78946360dba8f726784550856d3bd5d9ba27bf1e1e108522ca57d4ff3eb83cd6e94e73fc7399fb8e07bf0486cd819073e1eed4362e227e4f6e27c460d900e83228f2708b201c1402c9d7c1a759717e0f7cdffaba9543c5ed505bff0ba3cd80683fc9014e86137c620dad77c35ec52e8b9543a3175bc8c0142ab08a78b49c0ab1a8c63e16ef8f8da423011db73f0d16f28587dc5910abc6491876f293999c55283f59be3a92d2839b0c54087b2726a42d8d6847dbd229993434a501ed95af7ce12c91d4343352c496aebce5cf86b9cb22310d97c20ca6328bc9cc663af399d034d2197d58bd8591307be6026422059941fa49928c9e4425ee54c7cde0054c8bdfc923df2af845070e5275529ca42e3539cef351738fd6dc9c124d18ff49f05da69cec24643dffe93c3326f2778e14dff0b0a7b12e76536c712ca23f9167c78aa26ea03384563547a8cfb9514c871405a701dff9ad4b4e119c88c4a83a69684e1b0a6c8b6ddc5ef8400746898af19b04bddfd4a659d324ea9465176ca847f988d3885e718e134da54517a852458e149f1cf529e2f8c9c4dcc191a1d39b6949076a48a55e746b0d7ce846176944d87dd48d21cda93b1f1a4593ca9367f4046b46810756c37574aad9ec6720ef4956dc8d51ad65ecdd41b34a5711f6f59a42a5e0ecae1a54c2a6f5b15e0da7419b8ad097d6356e772d615eabfa57a3a2b1ad5cc56464532ad7956a14aa87cd2c36c9a9d76df235a0f074ebf800cbd4d2ff3a558f2d252a3a2578db752e96a66bedab25437b52da92d6b0734d68ffd638b0986ab3a900fded562f5bdc141e17a2a62d6ce1302b55cdb296b345c5ea0ab5daaf78ced6ba71456e7695bb32ff89d7b9ad85ee6ba55b5ed98e0da5e9c56e6f594a5d24fe0fbee04d6a755f0adbe91ab6aba6acad7af77bdadce6b3bbabb56780f7dad3cf6acfbcf7356e7e2d58d9dd6e777f882d5e00d9da4eb19258a0fd3def3c4539d8f16ab7754065a33a41da4491e2b6c0f525ee5babc6d3e0a678a18de5e250491abf0afb10b43f4e188f5b2c479f3e37c442566c25171cdd29ff50c04e4cf07539ec58cb1e98bbff9d315a6b4cdba70ad79b58b6b196374cbb0e77edffc3fe7daf9865fa46e09af8cc57c6b092f1c7649b76f4c9aa4d2cd8ac6cc12ab330b63a56315c594cd92e7b18c6ee0d3280cf49e1e0e2f8d005cdf41d1bed62f6fe34d232ee2d8dad6a673c1319d33addf34efb7c5427c717ca9376699a334c4954db3ab0a91e22abcbf9e3183777cecfb5ada1c97b6bc96aba94b675735997eb69bc7e97d2ae35b2b491fce5012f7a533dbe73af41fd6b518f99d4389a2fa12f6c5f55c790d34d4edfab032d6287e2b9d0e22e3664133c4a55ee9aafdb662e4c811d5f61c79bd8003776aec549c568a2a9de06a7e568d97ced842b7ccd0e7f12c20fbef0883fbce0165fd2c48fb4caebd26529204f4bc333fec0904f092b265c27f974462eca56ba9c98b1d412cb55fe72591e339962a2b9947ae9c1a0c90e9728d77965ca94a59757c9951349bad06b3373891bc5e83c1f66d3970e959a477d994b7f0b7ad374af94c766ea2af73a63c4aee1ac9bfdec68a75a4000003b),
('654226520797', 'TWS Edifier 3s Pro', 'Electronic', 0, 500000, 'SPE7604', 0x47494638396159015700f10000000000ff0000ffffff0000002c00000000590157004108ff0005081c48b0a0c18302010458c8b0a1000010230a586850a2408a1133421c6891a046001c3556149990e4c38d253f660cb91261c797284fb694d991e5c7912053229489f3a6ce823581c664b93328cf9f3b932a5dca94e8c400311542dd48f169c9aa1855e63cead1a4cfae33bfc2d41ad5244ea75cc59a4df915ad51b436bd0e457a56e8d6ba60e136ddcb57e9d8b877edf6941b9866d999801323253bf6ede2c38a0d17268bd73157c07f05bb9c7b59735eba7d438b7ebcb5ad67cc90ed36e6ac36ec61ca6c39bb4d2d3932eac9b4f1ded6dbf9b36fdda4470b179db9f666dc2a79b736ba9c36e3d7b283935e8ddc74dae8bd6167c7ce9c3bebdcc3c3fbff75bef6776cd7d5a1a72f4df836f5a2e4d9a3ef9edcb365faad819befad1cbcf8ff95a907df7ac545665d73f2b927e071b3c9f79e6ae51578da7912f2079a85db2508e086013ae81d81fe213898871a4a262283d219a7e26ef67d386285f77d57587f2572686371d6d1981f84248e68a07a271e84e3822b5228236f3ab637e17e312287a48de25508e5945442296595586639da955abac45197e1e52466456426f4255060a6b96169679ad9d5431e95a9e69c56a2b450540c5115c0457b9e84d59edae147e48fe829d8238ad71d5aa489475e9864a14bd238608774863624624b062ae38360714a5d90944e37a8914e3a7aa1a6a50ad9a8aaa95a5629a29ceaff87aa8fe7d1aae2a78435d920a182629ae8a43cc2e862a4a7faf76a5297ea1a6c88b96e4a24aef30dfb6badd4761aa1b1c5d69721b0fb496aeab1ac36a8acb590926b5bb53b321aed8c297a7aadb6bb22cae2b6f27e4bdf93e086bae8a3c2ae6b6bbacf29aaafbbbe6a176fb8cbd668efaab2629b6f8b0267aad5a3e7deaaa4bab1422ceea8eaeadbb0b6f7d68b61c8183e7c708ed9a6cbabb38a429bb16fc9726c708a1fabbc70aa1fe36b72bbe5f1cbacbf3c126a68c5273ffbee810ef7da2fb7f892ec2a9d6cee2ce79b6ec269b5d5515f2df5ce51675db5d75a57bdf5d864976df6d968a78dac9d537174274555f1c9d0405981cc72c541bacc71d12d1ffffd6ed32c2f2df2b8079f6dd19da5210e52dc0dcd6dd5ac4157bb72890113cd73df054facf1e09ad38b70b7d9eacc35db784eb5789f8d3b5eb7cd16670e74a2a88e1b73c41d6ffef9bc24e7ccb9c265cfce34a9144b8eeec5950b0f737c2fcf3cededc087befbefcb1b8ebcb4b8df6d7cde4036cbeef2042bbd2ae1cd7bae3bf3d19bedfbeeac833a7cb9c5ef7bf9e42f7e4f7df8b94bbcbdd3d8497d3ef9909b7bbdf61bb39baff806bf8479cc7ee99bdfc8e4b73dfd4def7e81fb59f200282a01caee8178eb5ce1107831c0e1cc7ea233d9fe6ad6c1f5f54a68a47a19014d18c15629b07f1ed48fb74a363acaf52c65256cdd09d73734e3ad50872d3c2093ff3a57bf2142d0850dac6100a1074316ae078518dbdbfb9c183f243291880c03e1f3bee5401b0e1087e52aa0ff5ad743f771cf68ae431aef7cc63bf02dd08a691b2107c348c5c8913185523c23e6bc0747fe61f18346bce21ac726472326f07562d41bed7ea8beda1def88559ce1f8c6f7341162107d396c24f648d4484652905cf883a4019de747513e526d856463f016b5c932a24c8f629cd7060d99c917da72905b4b2518fb35c1d729d272b0ac23281928c8430af2985c546232d586362e31338e0eeb62089fd9bb6852d37cd69c1348f2972fc46c534865daa683ae09b5afc5a94d77990c39d50436fdb5496cea3c27d6deb94e2a05266bf744e7d4eac9ffcf7efaf39f0005d3e1dae643a4acae968814e62f0b1a4c2082a88f24a4e31b6548ca4a3e6ca0a59b1be352c72747ee90959f5ca8192f15cbf0cd5295a49ca4166968c99c20ce6da6b34a411cf2b83ffecb6f9873e50d1baa490dd26c8e822b2532597a51d2252ea67f42dc9f3c6a3d90fa327b093d65053308af9fd252a26ecc6a368bea52823e447132ad8a545007289bda518d04d3e91779fa49595a15a5e25b2925b9d9523e954e221b7d1b5999fac4ff3d95936db55df78268bb880655a5815c2657978849ac06d6a101ece414213b4aa996d2985b14aa62bb79c9cb22b49769c5e32227dbd3aa96efaa8795eb4a2dca592f6a5580374d231ad57a41d7ffcacca7a7856b1125b95aba2e76aa8de5e56dff4a5b69ed0fad7fbb592453aadac412b5b58cf5ac63a3da4ad10293a4c2746b6e77f9b3a1ce35897505ae74854bbbea4671b46ca52e6eb9c447de3af7bba8ecac612538dcd09ef7baf129a9234fcadd36de72a8ac05972e337448d0ced6ba0cc52e65870951a07637b3f085a66d4d59bdbe3ad5beed7ba5824babc6185676b7cc756e808f35e0f68291aa187e0e7ebda85fe5b197b0717d6f6fc1fb5bd8ddb2c0f53df07d139cdfec9af4adfd75af902bea5be88a77befe552f71113cd21e2f58bb2f7ee890633cc311bfaac430fe287273ca640d3b99c3c99de887b32863111759c0f27570920dcce51d3799ffc53ede2f90098c50efce38be132ee66773dce60cef74c38f7571d2b24ce6298712cfd145f22ab70c453faf15d04aeeb072c70c48431353c28956f3a271da6815f318ce4ffef176e93c5d3b9b99c646b63185e9d75446f3b0cb7ffe72a0d73b682987d8d20dae669e834bdff28614aa2a24edac4d1be5e552f9d64446359a773dde5ea358c78eae6d74b77c685e27d9d4553e3389d38c5a67fb35c58c5931dfd85ced665f1bc277c6f491357de26f43dbd36f1e379fcbad68641fdb7356ae14966d4dea67f719de5e0635985de76106e39aa2f8d6f695b9addb5673fad56e0eb8bc7d4dec5a1b1bc4f7a63736995def7ebbfbdfe1fef4c4fdadf16e9f5bb328cccf37d4181ee4765ff8dd218ff7e5c87d69731f9c580957f6b639ce6e8fbf1ce4b1336e67a95df38e63fce845df78a64dbe69d902fd8fd2162fd173ddf04adbbbe464736640973dcdadaf1c97d2dcacd7d9b9d5b1931decca7caed9055af6b57749eb5f6f6650d239949ad85de56effcd6a36169bbc8709959b01279ac24678bf0f674c62bb1ad8e269f82d213eebfa643c3a11dfcec6ef059ff2c45a3af76979be549e907da7a7d6daa9f3cec3539f5e4a7ce14ddf14bcb39df124e9a0ebfd2e7bdd489ef5b8cfbdeeff1910003b),
('667472620390', 'Oppo A12', 'Electronic', 5, 500000, 'SPE1946', 0x47494638396159015700f00000000000ffffff2c00000000590157004008ff0003081c48b0a0c1830201281ca81000c385091b4a9468b021c200160b4ea418d1a1468807331214f9902346901b37965cd951a4ca8f292ba20479d1654a8f2771967c397226ce9b3a3bb2bc48b4a8d1a3436dfe044a532842922d270e9d0a5366d09c4a77de4cea532954ac52ab3a25ea356c4eab3cb92e8d29f62cd2b77091661dcbb4a9db90768152bd6bb52fccb960d9de2dbbf6abdeb65ffd0606acd5a4dac6867dc69d4c5931e0ba57138f852cb9ade2bd3c0987ee1cb8315ab38f8b8a26cd3933e9c33dd7569e4df972d7ad9e732f66bd59776493ab81bf369b36aa63ba762de3e66bfcb7dae28393d39efe7478e1e57b412f775eddb577db4c5397ff367efa78f4abca05ff860e9e3d6feaf0d33fc7de3b7679c6f5b57fb70ebbfdedfde6e187d775c201c8dd79eec916df82f221179e6efa8de65d4d795558606be09946de5fa8396854701176785e6b0d3268e2880ec2965d7dfd5948e1841c2ab8db8529fe779f8bf921b69d8509ce17e07b27522760904416b9e0904626a9645c482e1912434e4ef6d3485462a4d193094119e596426a69e595117d39a5985c96696286cd89a8197333eaf7e2671b22b8a38c12aea726903aaac7e39d74d287a2996fa139e38170b6c9a2746cdad9e7837fd6b9e78f32be9966a49396a8a28780066a1d86380e7823a56cba19a38f12faa8616c3de6685fa5870a26dea57f66fffae1a69312eadb9c858a8a2a7fb8d648e0a7254a6a68a27efa07e98ab25afa5faa9ec628e09ab68e27a79e8b12066c9eb312f86cb1bc1eab6ab2ab365a57aead960a61abe5914a5cb7a79288ad6acbbe07abb107ae09eeabf17adbecae34865ba8a2eaf66b6d9cee866bafafdbba8ae9b0e2dddb1dbe8c22ab68c2c286586dafd3b6cbaac188066c71bdf906ebb0b2daf259f1c6d1ea7a6a70823a6a60a7074f9b30b320beebf098237b19d4ce99e99ce5cf39273be6d05a120df4494127adf4d24c37edf4d336b3dce9bf184b3c759c522fba329f34778cb0bcdc5eac6fcce0b63ceeb9c4524b6edae97e2db08d046fdcf0c3283f0a72c930861ab4d911abff3a31d8e8a13baadb7c0fccefddd916fc77de35731c78ce85877df2b0290bce6fc091ffea2ccc5ecb0c78d7788bac74e6cc52ad36dad19a3b28add226087ae275bfcc78c836334dbac9741f0ef8e40013cebacbd73a0e3be576731e7aed4bdfaeafe9aa5b9df7d67867ae31c30b0bdba2ec24bfeeb4f295a7ddbcdf57b79eaff471531f6beed7070fb1f64d731ffec7bbe76e31e6bfaf0b29fbd6572df7c2f3e20979fd7dd39bf7ecb7b6d411b05600345cc1e6b6aff46d6e76c713def6122839f9c5ae80e1531d66d60737dd4170780ef460f67027c091b9ef79b73a9dbf52d836cfbd4d73d25a60f5d0a73ff3d1cb784f3b2106b16739d3b5306b1c84a10cffcfd7c01af64f6c889ba0d61088c21512af892ac3daf82828c4fd11313ddfb361b792d83e2a962e85598456060fb8ba258aef7e248c59e31637c2b175ae6c5e2421f3c8e8bc3922918c86735d1a3bb7c6e27dd08a4d32611c9707463a82af891a3c9bb80ac446e415518543bce11fbb082aa859329096b49dff0459c94c2a11599e4cde26cbe4903702aa943bbb522ab184ca5072c923382b9a2c81564a573a299690f319968ec64b5cdaf244ab24d3cf8cf6252ffdf298c84ca6329719241da2ce8f517462ef5c48be180272942e84df248f08ca9b0db27b8d649b050778c717422f9c0cc4a221b5584ed125cd994ed46634a3994846196b7adcfc96dbe419ffb50a96d09b66dce0337928ce7dcdcf7701b51f3a67f8c830fab371e9dcdb37df57ae758a11917854e43dcb97cf7f66b3a26e8c6044ff97d0005e3478e01ce30b439847aeedf1711e0329173b4a36a14d148a328d9f41414abf922af09a9d749c4315b648fc89d2a7feb423c5c6394d20f24fa1d074a43afb15c92de2f0934f3529a2c299528cae14632d4563484168c487d24e82940ce217a559d6c719f0ab2a0ceb42af98a7a1b28fa6a694153cebf8c079f6508ad1a3223ecd0ad37de6749b84cde14d7788528a16147a9c426a15d9d9cd8f9273a689c56a51935a48aa1ed28e3d0de260898a49cbce5592ee94a864d7cacfc7b27070d4142c47334b96b3ff9ed6aa93d4e46ae5d8d9a5ee949ca1cdea4f29ab4fd34615ad782decbdf6fad9befe95ad000aee66279b5cb24212a83145ab6ed5ca5be80e95778f92ee46ad495c8ff691a0dccded51d3dbd5c6e2d4b5678cac68674b5a6c9e577dc27da962774b48ef5a74ab2a956435f538567845f0b6ed94aa6ad9eb58ae3638c0b81db04b0b5cdb031f37bda9252983dfeb600e43b89c12162b17f377ddf24294a1ef5cec40ddcbd8ce8a975df4356a43ff5bdf046b77bdf9ad31784b7c52172374bee4adae811577e11c8f18c7d365ed61fd0adf7ab2b483043ef28c3d6be2b38e94931b6eb1089f4bcf8cda13c641a62d89edaa5fec16178efc6daf73e1db65b8d6f3ff9c45a6ab50697c57312359c00f26a89afd0b62d98659c7c5bdef9a31ac600d1bb9bbadddf341632bd9d1ca78aa332b7395958be62caf78cd8ae6e98f73ec68498f99ce9216725a0fdddf44e719b49b9e6ea729fc692a8b5ad4db2575a69fa8e5453b55d531f6340d794c5b58df39c2a7c674b0f9fc62b1ad5aca90fe5ca8ed3c3a15c773c95c7eae93c10ae50923bbaea0a6b0af9b9de66113d9c35ec573a373cdea5d9359dbcc4e715099a9576cb29b94eeb6e9badf6da6d2d27b4bf6967765ef1da57cf35b49febe655eeb7d1b3081652a35fd77c548c2709a1846e1d3a1b4d06af2918ab012e247a2a5c58b094b630e1ce3152fa6448f96ca60560969223d07395c70a613948489e35092b8ca0d2ef357ea522bc6f478ce67fea193f70c4c43330fcf871c6b5eea7c57fb1efac137d3f096e745e9508fbad4431910003b),
('771398559532', 'power bank samsung 500wat', 'Electronic', 3, 75000, 'SPE1946', 0x47494638396159015700f10000000000ff0000ffffff0000002c00000000590157004108ff0005081c48b0a0c18302010458c8b0a1000010232a0c305022c4810b251ab408a022478b1e3b168c189263c98b093f8a7ca872234a962b49a65c7952e34c93335dd2bc093227c29035838e7c29f3274ca046932a5dba5466c6984f212e14187522d5003609e284a932e64ba45c7b86f5fab16651b045d37ee599b52bd8b76cd5ee3c28b7eedaa33e8dca65cab72fdfbd71898add2a74ecd6b379ddb2352bb8ec50b268ef2a36dc58a7cec3772d2fdeacb57252c07e438bee0c393059bb7331772d4d9af1e9c6aa0927f68c9774ecc192733baefd1375e1c87335f31e4dfc2fedc9b753e35e0db736f2e5c9113b3fae3b3aede6cf833f2e2c7bbaf6d6798b8bff570a3abbefc7a8550b370f1bba58e0f0d1bb6fabfbf272f2ed5f2b67ddfbfaf8ff7451b75b72f6e9a7de76a671d75282087a87dd8294f1171e83c305a8df6fb37d171f801c36985e7e188ee51a68c01148e1641b92782284d2b5c862661eceb71e8ce055d82180e5bd485f560a3237a1772646e8da8cacb938a08ec20df92391e7d5281d913746e9a094545649a58a5666a9a568586ef99997c5a58690570f2554d14660a689a347658e84a656679aa9e69c1c3a851554514d2540557a5655e088fe0129e38abba518287b3b2649287e1772b6617f12d2c96889838a289f81f7c578e48ed6ed67e87e9d3e086aa67a81e86886932e2929a494726aaa6df91dffe8a48e1f62ea29aa3f228aa591b2b2ca59775d6abaaa7145d2fa6a8fd93159a9aef5e15a21b391f24aaaaf9656fbe898810e8b6db19b36892c929a06092d94ce2a2964aed54dbbedb7b7da28acb6a90aea6aa3b0daba6bacaf8efbee94f5d62a6a81c1ce3a2fb9a5460a2fc18886d8e9bdb6b2ebefbe0c878aeea8897e96ef7be5aeabeac19f8a8b71b5ab1d8a2fbdfa0a7cedb9281b0970b6e11e9bb185cd716c32a1defe1af2bf348f6ceea7a24afc6cba1517cc2ec1d43e09af861cd3f4554c72b6c974d332cbbcd3d36dc6e9749c5447adf5d65c77edf5d760fbfa544519954d51420d9dbde79d40031aadce3677fb718e6fcb1d74cfeac21cb7ca1b9fffbcb59d44f1a976da7db24db1db38a73cdfc333f36b6eb20d3e4e63ab0ab3dcb8d780e32951e1845fc5e3dee00aecb1dd7cf32bedbc0caf6c70cbf4fabd2fe6028e7e3ae2134b8e3adc8d47bcb8c814074cf9a98e6bec6ed474cbdeb669a9e7dc30853c4fec73e9b6c71ba4eb97775dfcb273ef7e7786c6dfde2eddaa471ff9a216939cfdead5737dfdc0c02fccbbed8ca3e8aceede272ebed0a07f3ff9cb7fc78efde720bb59ed9407bff335af5fb8831ef9f0174000fa8e7f5a5b5f9380a5bde429ae7ecc9b1fef9ed72c04a2ef77d68260fafac7adeefd0979ef23a0f24a07be4bc5af83f72b5aa5a847c3a4f98f7d216c20e444f73f9f1df0742f6c570cff85373d11d6f06012bc98032b98c20b069182dcc21b067fd63bcb81108a317b9df56e38c1f3d5ca82095b61075be8c12152b157449ca111d788442e2a717628ac5b019787b21f022d888abaa0f4d4183cbd0d4f6a6e34df12bd074663d1517ea6dba0f6ecb74019e2f0880f6c63097b78bc0815d26e7364a180c2d748e7e54d59ad6363248f16c8a15d8a76549c6326c7b849172610869df46311fb48b42d7e306c601b252ed567451bde7297b6cc2230bfa6cb34210d896f7ad3d39669b46146a92d587b9298cab43f67dee89847a30b9ce4b44cac59cd9a57f22637c559b5a97d139ce84ca73ad7c9ce2c654e959e83a3259b1846271a5083553c242cf558ff3e538e508bbc14c9d8d0d610ab5c256df1ac64c8e4a8427b0ef280ab646819fbc63d97d112a0248c27d90ca7279838646d83fc223d0d19518429728a0ae427036719c962aeea9d04dddcd90a6a503f9d328e89ab67c9ec984f3302b197f2aadc2f5d2a29983e4470096548420f87d3013ab4a4103b291ec7a75247d6eca2ff241e4a067a548e0e8e213535dc09e729519d1a52935174a53e85184b500a55984724e524710845919695a462d45f5a275a554f6e4f967c6c2950e5daaa2e86746497ec1ee378cac9be9ef193ac7b2b45b10ac8b91a569e0bcd295e1d8ad693952ca53bb4aa4505fb4bc25694ae5e44ec4831995793d68d836c75ac5bdb0754a2ffd2298982c4ac0053d9d09de2538a53ad9119679b43d2c2d597857da342778b56c5e28eb16af5e91d6bab5cbdee119bdac2ad3f1d96b727beb250bff56b70814bdddcb2f298b69d9376f337d6cc3ad5aca43baf67cfdac4e14696b6431d6c764bc9de9b9255b3ace5ac7c5ff6d97d86368d8f14a57e87b55e1d2ed747bc7d6a6ba3fada453ad5be3c0c2565d9685a795df6c107f67075171bdec7a2d4c0a113ad868d3bd90e7b77c54cbc6b807d9bc80a9f38b621262e16279b5e353598a53106b073e9085dbe86f8a7f935af75fbd9e2fd5ab6baed65ee7987bcb3122359ba3de5319431ca65ad3e59c9518670732939c5224335c218bee23dffc861272717ffccfe756f84e1eb432b4f77ad79ccf17d8b5bdee34af2cddbcd1f1a45ac6412d798bc78a6aa9e332c59366ff8cfa7fd3053fffbdecdd2988c578e65a61d2de95a0216bb0ce6af83272de731a336be4bee6381719c62045f95c58e76f1775f1de44acf98bea9a6df78c5dbe7fe6635ae6e8ef496eb854a534bdad098be33961bdb4c353f54cba50d36a1033dea41bff8cc669e309adbbae71d737ac12f15359009b95a2a67f0d0bc4eb470b9cd68fcfab9c7c61477606b3d674be3dab5885e7674a14d6d58371bb9c28633b19b5aef5ba31adfe9d6b791abd9e92e033bd45fee37bd8d3de2e7da39cb8eddf4bf83ea6e7e3719e280f63577ff7a6d6d675bc012aa4df3691bbd717883e9c7f326b78ccd5dc78b33bbd526f677ccdf0deea2f6bc9d2fff39d0b7e4722f157de8523a3ad2af29741f377de9577a3ad49f2975aa6fdce76799dad2b6aeb4ab4fbd60fcb95bd6abf9f5bf848d69da114937c75976f14cf36abd5166dbeb74f664b2899b453ae7dc9b224e94644d327707f5dedd944b6d1a7e9b5983dae0fbf276bd2b6d9b555bbcd90b6f77de8cbdeb8297fce5856b173f4bfef3a00f3d2e0302003b);

-- --------------------------------------------------------

--
-- Table structure for table `promo`
--

CREATE TABLE `promo` (
  `kode_diskon` char(9) NOT NULL DEFAULT 'Tidak Ada',
  `minimum` int(7) NOT NULL,
  `diskon` int(7) NOT NULL,
  `status` char(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `promo`
--

INSERT INTO `promo` (`kode_diskon`, `minimum`, `diskon`, `status`) VALUES
('DSC5301', 10000, 6000, 'Active'),
('DSC6187', 8000, 1000, 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `restock`
--

CREATE TABLE `restock` (
  `id_transaksi` char(7) NOT NULL,
  `nama_produk` varchar(35) NOT NULL,
  `jumlah` int(10) NOT NULL,
  `harga` int(10) NOT NULL,
  `id_supplier` char(7) NOT NULL,
  `id_produk` char(13) NOT NULL,
  `total` int(10) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `restock`
--

INSERT INTO `restock` (`id_transaksi`, `nama_produk`, `jumlah`, `harga`, `id_supplier`, `id_produk`, `total`, `tanggal`) VALUES
('RST0978', 'kabel otg', 11, 15000, 'SPE7604', '411891389826', 165000, '2024-05-14'),
('RST4019', 'Oppo A12', 5, 500000, 'SPE1946', '667472620390', 2500000, '2024-05-16'),
('RST4535', 'kartu telkomsel 1 gb', 5, 12000, 'SPC7412', '529869193099', 60000, '2024-05-14'),
('RST8120', 'power bank samsung', 1, 50000, 'SPE7604', '771398559532', 50000, '2024-03-31'),
('RST9055', 'kartu telkomsel 1 gb', 10, 100000, 'SPC7412', '529869193099', 1000000, '2024-05-14');

--
-- Triggers `restock`
--
DELIMITER $$
CREATE TRIGGER `DELETE_RESTOCK_DATA` AFTER DELETE ON `restock` FOR EACH ROW BEGIN
    UPDATE produk 
    SET jumlah = jumlah - OLD.jumlah
    WHERE id_produk = OLD.id_produk;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `UPDATE_RESTOCK` AFTER UPDATE ON `restock` FOR EACH ROW BEGIN
    DECLARE selisih INT;
    
    SET selisih = NEW.jumlah - OLD.jumlah;
    
    UPDATE produk 
    SET jumlah = jumlah + selisih
    WHERE id_produk = NEW.id_produk;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `restock_produk` AFTER INSERT ON `restock` FOR EACH ROW BEGIN
    DECLARE product_count INT;
    SELECT jumlah INTO product_count FROM produk WHERE id_produk = NEW.id_produk;
    UPDATE produk SET jumlah = product_count + NEW.jumlah WHERE id_produk = NEW.id_produk;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` char(7) NOT NULL,
  `nama_supplier` varchar(25) NOT NULL,
  `tlp_supplier` char(13) NOT NULL,
  `kategori` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama_supplier`, `tlp_supplier`, `kategori`) VALUES
('SPA2757', 'ali', '085676234515', 'Accessories'),
('SPC0624', 'Azkia', '086543675434', 'Phone credit/Internet credit'),
('SPC7412', 'huda', '085292347123', 'Phone credit/Internet credit'),
('SPE1946', 'azka', '085676234514', 'Electronic'),
('SPE7604', 'ramzi farhan', '085678564322', 'Electronic'),
('SPP4056', 'april', '085678564321', 'Part');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` char(11) NOT NULL,
  `tanggal` date NOT NULL,
  `total` int(10) NOT NULL,
  `idUser` char(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `tanggal`, `total`, `idUser`) VALUES
('04225853254', '2024-05-16', 40000, 'USR6816'),
('89755823645', '2024-05-16', 94000, 'USR6816'),
('99630511639', '2024-05-16', 30000, 'USR6816');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_detail`
--

CREATE TABLE `transaksi_detail` (
  `id_transaksi` char(11) DEFAULT NULL,
  `product_id` char(13) DEFAULT NULL,
  `quantity` int(10) NOT NULL,
  `subtotal` int(10) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi_detail`
--

INSERT INTO `transaksi_detail` (`id_transaksi`, `product_id`, `quantity`, `subtotal`, `tanggal`) VALUES
('89755823645', '529869193099', 5, 100000, '2024-05-16'),
('04225853254', '411891389826', 1, 15000, '2024-05-16'),
('99630511639', '411891389826', 2, 30000, '2024-05-16');

--
-- Triggers `transaksi_detail`
--
DELIMITER $$
CREATE TRIGGER `UpdateStockProduct` AFTER INSERT ON `transaksi_detail` FOR EACH ROW BEGIN
    UPDATE produk
    SET jumlah = jumlah - NEW.quantity
    WHERE id_produk = NEW.product_id;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_member`
--

CREATE TABLE `transaksi_member` (
  `id_transaksi` char(11) DEFAULT NULL,
  `id_member` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi_member`
--

INSERT INTO `transaksi_member` (`id_transaksi`, `id_member`) VALUES
('89755823645', 'MBR9883');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_servis`
--

CREATE TABLE `transaksi_servis` (
  `id_transaksi` char(11) NOT NULL,
  `nama_customer` varchar(25) NOT NULL,
  `tlp_customer` char(13) NOT NULL,
  `alamat_customer` varchar(50) NOT NULL,
  `biaya` int(10) NOT NULL,
  `keterangan` varchar(50) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi_servis`
--

INSERT INTO `transaksi_servis` (`id_transaksi`, `nama_customer`, `tlp_customer`, `alamat_customer`, `biaya`, `keterangan`, `tanggal`) VALUES
('04225853254', 'ali', '085678543567', 'baron', 25000, 'servis speaker', '2024-05-16');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`id_akun`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `data_pengguna`
--
ALTER TABLE `data_pengguna`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `detail_transaksi_diskon`
--
ALTER TABLE `detail_transaksi_diskon`
  ADD KEY `kode_diskon` (`kode_diskon`),
  ADD KEY `id_transaksi` (`id_transaksi`);

--
-- Indexes for table `laporan`
--
ALTER TABLE `laporan`
  ADD PRIMARY KEY (`id_laporan`),
  ADD UNIQUE KEY `tanggal` (`tanggal`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id_member`);

--
-- Indexes for table `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`id_produk`),
  ADD KEY `id_supplier` (`id_supplier`);

--
-- Indexes for table `promo`
--
ALTER TABLE `promo`
  ADD PRIMARY KEY (`kode_diskon`);

--
-- Indexes for table `restock`
--
ALTER TABLE `restock`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_supplier` (`id_supplier`),
  ADD KEY `id_produk` (`id_produk`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `idUser` (`idUser`);

--
-- Indexes for table `transaksi_detail`
--
ALTER TABLE `transaksi_detail`
  ADD KEY `product_id` (`product_id`),
  ADD KEY `id_transaksi` (`id_transaksi`);

--
-- Indexes for table `transaksi_member`
--
ALTER TABLE `transaksi_member`
  ADD KEY `id_member` (`id_member`),
  ADD KEY `id_transaksi` (`id_transaksi`);

--
-- Indexes for table `transaksi_servis`
--
ALTER TABLE `transaksi_servis`
  ADD KEY `id_transaksi` (`id_transaksi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `laporan`
--
ALTER TABLE `laporan`
  MODIFY `id_laporan` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=877107;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `akun`
--
ALTER TABLE `akun`
  ADD CONSTRAINT `akun_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `data_pengguna` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `detail_transaksi_diskon`
--
ALTER TABLE `detail_transaksi_diskon`
  ADD CONSTRAINT `detail_transaksi_diskon_ibfk_2` FOREIGN KEY (`kode_diskon`) REFERENCES `promo` (`kode_diskon`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detail_transaksi_diskon_ibfk_3` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `laporan`
--
ALTER TABLE `laporan`
  ADD CONSTRAINT `laporan_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `data_pengguna` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `produk`
--
ALTER TABLE `produk`
  ADD CONSTRAINT `produk_ibfk_1` FOREIGN KEY (`id_supplier`) REFERENCES `supplier` (`id_supplier`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `restock`
--
ALTER TABLE `restock`
  ADD CONSTRAINT `restock_ibfk_1` FOREIGN KEY (`id_supplier`) REFERENCES `supplier` (`id_supplier`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `restock_ibfk_2` FOREIGN KEY (`id_produk`) REFERENCES `produk` (`id_produk`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`idUser`) REFERENCES `data_pengguna` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi_detail`
--
ALTER TABLE `transaksi_detail`
  ADD CONSTRAINT `transaksi_detail_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `produk` (`id_produk`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_detail_ibfk_3` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi_member`
--
ALTER TABLE `transaksi_member`
  ADD CONSTRAINT `transaksi_member_ibfk_2` FOREIGN KEY (`id_member`) REFERENCES `member` (`id_member`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_member_ibfk_3` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi_servis`
--
ALTER TABLE `transaksi_servis`
  ADD CONSTRAINT `transaksi_servis_ibfk_1` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

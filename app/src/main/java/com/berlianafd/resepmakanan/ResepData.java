package com.berlianafd.resepmakanan;

import java.util.ArrayList;

public class ResepData {
    private static String[] resepNames = {
            "Ayam Masak Pedas",
            "Bihun Rebus Kuah Pedas",
            "Sop Ayam",
            "Banana Strawberry Smoothies",
            "Dalgona Oreo Coffe",
            "Sambal Pedas Baby Cumi",
            "Chicken Wing Drumstick",
            "Pisang Geprek Keju",
            "Oreo Cake",
            "Chocolate Muffin"
    };


    private static String[] resepJenis = {
            "Resep Olahan Ayam",
            "Resep Masakan Harian",
            "Resep Olahan Ayam",
            "Resep Es",
            "Resep Es",
            "Resep Masakan Harian",
            "Resep Olahan Ayam",
            "Resep Jajanan",
            "Resep Cake",
            "Resep Jajanan"
    };

    private static String[] resepUrl = {
            "EAyBpZeCo4Y", //https://www.youtube.com/watch?v=EAyBpZeCo4Y
            "V7MlKOQIHxI",
            "60-1MtIPyoI",
            "eUrwtbQolKI",
            "5_0q9ul_sp4",
            "JTULn3ZWFKg",
            "98PeOmlFx8E",
            "QM7eaqFdZPc",
            "UsJmUgA1jKI",
            "M9No-mo1PAM"
    };

    private static int[] resepImages = {
            R.drawable.ayammasakpedas,
            R.drawable.bihunkuah,
            R.drawable.sopayam,
            R.drawable.smoothies,
            R.drawable.dalgonaoreo,
            R.drawable.sambal,
            R.drawable.drumstick,
            R.drawable.pisang,
            R.drawable.oreocake,
            R.drawable.muffin,
    };

    private static String[] resepDetails = {
            "1 ekor ayam dipotong2 dan dicuci bersih\n" +
                    "2 ruas kunyit dan 2 ruas jahe\n" +
                    "3 buah kemiri\n" +
                    "7 buah cabai rawit merah\n" +
                    "3 siung bawang putih\n" +
                    "5 siung bawang merah\n" +
                    "1/2 sdt ketumbar, 1/2 sdt merica dan 1/2 sdt jintan\n" +
                    "2 lembar daun salam\n" +
                    "3 lembar daun jeruk\n" +
                    "Sereh digeprek\n" +
                    "Lengkuas digeprek\n" +
                    "1/2 sdt garam, 1/2 sdt gula pasir, 1/4 sdt kaldu bubuk\n" +
                    "2 sdm kecap manis",
            "Sayuran : kol, sawi hijau dan wortel\n" +
                    "1 buah tomat dan daun bawang seledri\n" +
                    "100 gr bihun\n" +
                    "2 buah sosis dan 4 buah bakso\n" +
                    "1 butir telur dan kecap manis sesuai selera\n" +
                    "1/2 sdt garam, 1/2 sdr garam dan kaldu bubuk\n" +
                    "4 siung bawang merah\n" +
                    "2 siung bawang putih\n" +
                    "2 kemiri dan 5 cabai rawit merah\n" +
                    "1/4 sdt merica",
            "1/4 kg daging ayam dipotong kecil2\n" +
                    "Aneka sayuran : kol, 2 buah wortel, 1 buah kentang, daun bawang seledri dan buncis\n" +
                    "4 siung bawang merah\n" +
                    "2 siung bawang putih\n" +
                    "1/4 sdt merica\n" +
                    "Garam, gula pasir dan kaldu bubuk\n" +
                    "2 ruas jahe digeprek",
            "2 buah pisang\n" +
                    "7 buah strawberry\n" +
                    "250 ml susu cair\n" +
                    "3 sdm susu kental manis\n" +
                    "Semangkok es batu",
            "2 bungkus nescafe\n" +
                    "2 sdm gula pasir\n" +
                    "Susu cair dan es batu\n" +
                    "Oreo sebagian dihaluskan secukupnya\n" +
                    "2 sdm air panas",
            "1 ons baby cumi\n" +
                    "5 siung bawang merah\n" +
                    "2 siung bawang putih\n" +
                    "15 cabai merah keriting\n" +
                    "10 cabai rawit merah\n" +
                    "4 lembar daun jeruk\n" +
                    "1/2 butir gula jawa\n" +
                    "1/2 sdt garam\n" +
                    "1/4 sdt kaldu bubuk",
            "10 buah sayap ayam\n" +
                    "1 bungkus tepung bumbu\n" +
                    "Tepung panir atau tepung roti secukupnya\n" +
                    "Air secukupnya\n" +
                    "Minyak goreng untuk menggoreng",
            "3 buah pisang tanduk\n" +
                    "12 sdm tepung terigu\n" +
                    "50 gr keju parut\n" +
                    "1/2 sdt garam dan 1/2 sdt gula pasir\n" +
                    "Air secukupnya\n" +
                    "Tepung roti secukupnya",
            "2 bungkus oreo @137 gr\n" +
                    "250 ml susu cair\n" +
                    "175 gr coklat dcc\n" +
                    "20 gr margarin\n" +
                    "125 ml susu cai",
            "180 gr tepung terigu pro sedang\n" +
                    "125 gr gula pasir \n" +
                    "150 gr margarin dicairkan\n" +
                    "2 sdm tepung maizena dan 2 sdm coklat bubuk\n" +
                    "2 butir telur\n" +
                    "1 sdt soda kue dan 1/2 sdt baking powder\n" +
                    "1 sdt vanila dan 50 ml susu cair\n" +
                    "60 gr coklat dcc dicincang\n" +
                    "Chocochip secukupnya buat topping"
    };

    static ArrayList<Resep> getListData() {
        ArrayList<Resep> list = new ArrayList<>();
        for (int position = 0; position < resepNames.length; position++) {
            Resep resep = new Resep();
            resep.setName(resepNames[position]);
            resep.setDetail(resepDetails[position]);
            resep.setJenis(resepJenis[position]);
            resep.setPhoto(resepImages[position]);
            resep.setVideourl(resepUrl[position]);
            list.add(resep);
        }
        return list;
    }
}

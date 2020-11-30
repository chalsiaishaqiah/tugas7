package simple.example.hewanpedia;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Dinosaurus;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinyaberasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }


    private static List<Dinosaurus> initDataDinosaurus(Context ctx) {
        List<Dinosaurus> Dinosaurus = new ArrayList<>();
        Dinosaurus.add(new Dinosaurus("Tyronnosaurus Rex", "Mongolia",
                "Jenis dinosaurus yang sangat populer ini biasa dikenal dengan T-Rex. T-Rex juga dikenal sebagai predator ganas dengan gigitan tertajam di antara binatang purba lainnya.", R.drawable.tyrannosaurus_rex));
        Dinosaurus.add(new Dinosaurus("Velociraptor", "Rusia",
                "Merupakan jenis dinosaurus pemangsa yang mirip dengan si T-Rex. Namun kalau si Raptor ini ukurannya lebih kecil dari T-Rex.", R.drawable.velociraptor));
        Dinosaurus.add(new Dinosaurus("Spinosaurus", "Maroko",
                "Merupakan theropoda raksasa yang dapat tumbuh hingga 15 meter dengan tinggi sekitar 5 meter dan berat mencapai 7,6 ton.", R.drawable.spinosaurus));
        Dinosaurus.add(new Dinosaurus("Ankylosaurus", "Inggris",
                "Merupakan jenis dinosaurus dengan tubuh sepanjang 9 meter. Sedangkan beratnya mencapai 9 ton. Dinosaurus ini memiliki cangkang tubuh yang keras sebagai perisai pertahanan.", R.drawable.ankylosaurus));
        Dinosaurus.add(new Dinosaurus("Stegosaurus", "Amerika Utara",
                "Jenis dinosaurus ini merupakan yang paling mudah diidentifikasi, karena identik dengan memiliki baris sisik yang saling silang di punggungnya.", R.drawable.stegosaurus));
        Dinosaurus.add(new Dinosaurus("Brontosaurus", "Amerika Serikat",
                "Apatosaurus atau yang biasa dikenal dengan Brontosaurus merupakan salah satu jenis dinosaurus yang memiliki leher panjang dan tubuhnya bisa mencapai 26 meter dengan berat 32 ton.", R.drawable.brontosaurus));
        return Dinosaurus;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataDinosaurus(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

    private static class Context {
    }
}

package com.example.rwash;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   private RecyclerView recyclerView;
   private ArrayList<Favorite> imageArrayList;
   private FavoriteAdapter adapter;

   private RecyclerView recyclerView1;
   private ArrayList<Histori>imageArrayListHistori;
   private HistoriAdapter adapterHistori;

   //Buat Font

    TextView txt_cariKategori, txt_lokasimu, txt_tempatLokasi, txt_terfavorit,
             txt_historiCuci,txtcard_terbaik,txtcard_terdekat,txtcard_promo,txtcard_terbaru,
             txtcard_cuciMurah,txtcard_cuciSteam,txtRecycler_nama;

   

    private String[] namas = new String[] {"Lodaya Auto Wash clean", "Bersih Mobil", "Cuci Bersih ABC", "Car Wash", "WishWash", "Bersih Bening", "Air Wash", "WashUp", "Washing Time","Cahaya Abadi"};

    int[] pics = new int[] {
            R.drawable.pic,
            R.drawable.pic,
            R.drawable.pic,
            R.drawable.pic,
            R.drawable.pic,
            R.drawable.pic,
            R.drawable.pic,
            R.drawable.pic,
            R.drawable.pic,
            R.drawable.pic
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //First Recycler Tempat Cuci

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);


        imageArrayList = tempatFavorit();
        adapter = new FavoriteAdapter(this, imageArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));

        //Second Recycler Histori Cuci


        recyclerView1 = (RecyclerView)findViewById(R.id.recycler_view_dua);

        imageArrayListHistori = tempatHistori();
        adapterHistori = new HistoriAdapter(this, imageArrayListHistori);
        recyclerView1.setAdapter(adapterHistori);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));

        //Buat Font

        txt_cariKategori=(TextView)findViewById(R.id.cari_kategori);
        txt_lokasimu=(TextView)findViewById(R.id.dashboard_textView_Lokasimu);
        txt_tempatLokasi=(TextView)findViewById(R.id.dashboard_textView_TempatLokasimu);
        txt_terfavorit=(TextView)findViewById(R.id.text_fav);
        txt_historiCuci=(TextView)findViewById(R.id.text_history);
        txtcard_terbaik=(TextView)findViewById(R.id.terbaik);
        txtcard_terbaru=(TextView)findViewById(R.id.terbaru);
        txtcard_terdekat=(TextView)findViewById(R.id.terdekat);
        txtcard_cuciMurah=(TextView)findViewById(R.id.tempat_cuci);
        txtcard_cuciSteam=(TextView)findViewById(R.id.cuci_steam);
        txtcard_promo=(TextView)findViewById(R.id.promo);
        txtRecycler_nama=(TextView)findViewById(R.id.nama_tempat_fav);


        Typeface customFont=Typeface.createFromAsset(getAssets(),"font/Geometria-Light.ttf");
        txt_lokasimu.setTypeface(customFont);

        Typeface customFont2=Typeface.createFromAsset(getAssets(), "font/Geometria-Medium.ttf");
        txt_tempatLokasi.setTypeface(customFont2);

        Typeface customFont3=Typeface.createFromAsset(getAssets(),"font/Geometria.ttf");
        txt_cariKategori.setTypeface(customFont3);
        txt_terfavorit.setTypeface(customFont3);
        txt_historiCuci.setTypeface(customFont3);
        txtcard_promo.setTypeface(customFont3);
        txtcard_terbaik.setTypeface(customFont3);
        txtcard_terdekat.setTypeface(customFont3);
        txtcard_cuciSteam.setTypeface(customFont3);
        txtcard_cuciMurah.setTypeface(customFont3);
        txtcard_terbaru.setTypeface(customFont3);







        }
        // Recycler View Tempat Cuci

        private ArrayList<Favorite> tempatFavorit(){

        ArrayList<Favorite> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Favorite favorite = new Favorite();
            favorite.setNama(namas[i]);
            favorite.setPic(pics[i]);
            list.add(favorite);
        }
         return list;
        }

        // Recycler View Histori Cuci

    private ArrayList<Histori> tempatHistori(){

        ArrayList<Histori> listHistori = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Histori histori = new Histori();
            histori.setNamaHistori(namas[i]);
            histori.setPicHistori(pics[i]);
            listHistori.add(histori);
        }
        return listHistori;
    }
}

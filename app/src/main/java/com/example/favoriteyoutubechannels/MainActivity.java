package com.example.favoriteyoutubechannels;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.IgnoreExtraProperties;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity<mDatabase> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private DatabaseReference mDatabase;
    mDatabase = FirebaseDatabase.getInstance().

    MainActivity() {

    }




    @IgnoreExtraProperties
    public class User{
        public String YoutubeCH;
        public int Ranking;
        public String Link;
        public String Reason;

        public User(){

        }
        {
            YoutubeCH = "Tendo XI";
            Ranking = 1;
            Link = "https://www.youtube.com/user/SuperNicksonic";
            Reason = "He makes GOAT edits of his equally GOAT Tekken gameplay. Definitely someone you should watch if you like Tekken.";
        }
        {
            YoutubeCH = "Avoiding the Puddle";
            Ranking = 2;
            Link = "https://www.youtube.com/user/AvoidingthePuddle";
            Reason = "A hilarious streamer who will pull you in with his way of telling stories and advice";
        }
        {
            YoutubeCH = "Game Maker's Toolkit";
            Ranking = 3;
            Link = "https://www.youtube.com/user/McBacon1337";
            Reason = "This channel gives insights on game design and he does so in an easy to understand way. If you like games or interested in making one, he's definitely the guy to turn to";
        }
        {
            YoutubeCH = "Core-A Gaming";
            Ranking = 4;
            Link = "https://www.youtube.com/channel/UCT7njg__VOy3n-SvXemDHvg";
            Reason = "He makes top tier fighting game content that even scrubs like me can grasp and I feel I can understand and appreciate fighting games because of this channel";
        }
        {
            YoutubeCH = "Cinemassacre";
            Ranking = 5;
            Link = "https://www.youtube.com/user/JamesNintendoNerd";
            Reason = "Home to the Angry Video Game Nerd who reviews classic games in a hilarious but crude way because of his swearing";
        }
        {
            YoutubeCH = "Imyourfather tekken";
            Ranking = 6;
            Link = "https://www.youtube.com/channel/UCEARCcTaNdahVnJ97ay4i_g";
            Reason = "His gameplay and mastery with Lee Chaolan knows no bounds. Despite the language barrier, he is still fun to watch.";
        }
        {
            YoutubeCH = "Internet Historian";
            Ranking = 7;
            Link = "https://www.youtube.com/channel/UCR1D15p_vdP3HkrH8wgjQRw";
            Reason = "Although most channels that cover history have a serious air to them, Internet Historian does it differently by interlacing memes and hilarious edits that make it not so boring to watch";

        }
        {
            YoutubeCH = "RDCWorld";
            Ranking = 8;
            Link = "https://www.youtube.com/user/RDCworld1";
            Reason = "Their skits about anime and the hood never fail to bring a smile to my face";
        }
        {
            YoutubeCH = "String Player Gamer";
            Ranking = 9;
            Link = "https://www.youtube.com/user/mangdiws";
            Reason = "He does awesome violin covers of the most beloved video game soundtracks.";
        }
        {
            YoutubeCH = "The Consouls";
            Ranking = 10;
            Link = "https://www.youtube.com/user/TheConsoulsBand";
            Reason = "As someone who likes jazz and video games, this channel puts out cool jazz covers of various videogame soundtracks";
        }
        {
            YoutubeCH = "1nonly";
            Ranking = 11;
            Link = "https://www.youtube.com/channel/UCWWeVxWjE0EESAs5vMsy1Zw";
            Reason = "I'm giving this channel an honorable mention only because their music is so good. A friend recommended one of their songs and I have been hooked ever since.";
        }

    }
}
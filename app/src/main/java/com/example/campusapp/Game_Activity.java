package com.example.campusapp;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Game_Activity extends AppCompatActivity {

    //1=red 0=yellow
    int activePlayer=0,c;
    int[] gamestate = {9,9,9,9,9,9,9,9,9};
    int[][] winningPositions = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    boolean gameIsActive = true;

    public void dropIn(View view) {

        ImageView counter = (ImageView) view;

        int tappedCounter = Integer.parseInt(counter.getTag().toString());
        if (gamestate[tappedCounter] == 9 && gameIsActive) {
            gamestate[tappedCounter]=activePlayer;
            counter.setTranslationY(-1000f);
            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.yellow);
                activePlayer = 1;
            } else {
                counter.setImageResource(R.drawable.red);
                activePlayer = 0;
            }
            counter.animate().translationYBy(1000f).setDuration(300);

            for(int[] winningPosition : winningPositions){
                if(gamestate[winningPosition[0]] == gamestate[winningPosition[1]]
                        && gamestate[winningPosition[1]] == gamestate[winningPosition[2]]
                        && gamestate[winningPosition[0]] !=9){ c=1;
                    //won
                    gameIsActive=false;
                    String winner="Red";
                    LinearLayout layout=(LinearLayout)findViewById(R.id.playAgainLayout);
                    layout.setBackgroundColor(Color.parseColor("#ff0000"));
                    if (gamestate[winningPosition[0]] == 0){
                        winner="yellow";
                        layout.setBackgroundColor(Color.parseColor("#fde600"));
                    }
                    TextView winnerMessage = (TextView) findViewById(R.id.playAgainMessage);
                    winnerMessage.setText(winner+" has won ");
                    layout=(LinearLayout)findViewById(R.id.playAgainLayout);
                    layout.setVisibility(View.VISIBLE);
                }
                else {
                    boolean gameIsOver=true;
                    for(int counterState : gamestate){
                        if (counterState == 9)
                            gameIsOver=false;
                    }
                    if (gameIsOver && c!=1){
                        LinearLayout layout=(LinearLayout)findViewById(R.id.playAgainLayout);
                        layout.setBackgroundColor(Color.parseColor("#0000ff"));
                        TextView winnerMessage = (TextView) findViewById(R.id.playAgainMessage);
                        winnerMessage.setText(" It's a draw ");
                        layout.setVisibility(View.VISIBLE);
                    }
                }
            }
        }
    }
    public void playAgain(View view){
        gameIsActive=true;
        LinearLayout layout=(LinearLayout)findViewById(R.id.playAgainLayout);
        layout.setVisibility(View.INVISIBLE);
        activePlayer=0;
        for(int i=0;i<gamestate.length;i++){
            gamestate[i]=9;
        }
        GridLayout gridLayout= (GridLayout) findViewById(R.id.gridLayout);
        for(int i=0; i< gridLayout.getChildCount();i++){
            ((ImageView) gridLayout.getChildAt(i)).setImageResource(0);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}

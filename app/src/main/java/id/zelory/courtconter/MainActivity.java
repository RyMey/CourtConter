package id.zelory.courtconter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity
{
    /**
     * track the score for team A
     */
    int scoreTeamA = 0;
    /**
     * track the score for team B
     */
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Display the team A score
     *
     * @param score
     */
    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for team A by 3 points
     *
     * @param view
     */
    public void addThreePointForTeamA(View view)
    {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for team A by 2 points
     *
     * @param view
     */
    public void addTwoPointForTeamA(View view)
    {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for team A by 1 point
     *
     * @param view
     */
    public void addOnePointForTeamA(View view)
    {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Display the team B score
     *
     * @param score
     */
    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for team B by 3 points
     *
     * @param view
     */
    public void addThreePointForTeamB(View view)
    {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for team B by 2 points
     *
     * @param view
     */
    public void addTwoPointForTeamB(View view)
    {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for team B by 1 point
     *
     * @param view
     */
    public void addOnePointForTeamB(View view)
    {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset the score from team A and team B
     * @param view
     */
    public void resetScore(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

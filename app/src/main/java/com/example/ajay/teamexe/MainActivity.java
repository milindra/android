package com.example.ajay.teamexe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    String[] online_events = {
            "Game of Codes II", "Xquizitte", "Backtrack", "Web-o-Magica", "Paradox"
    };
    String[] offline_events={
            "EXEplore", "Tick tock clash", "Code Hunt", "PsyCODE", "Virtual Reality", "Typeracer"
    };
    String[] tagline_array={
            "first tagline", "second tagline", "third tagline"
    };

    String[] online_content={
            "Game of Codes II is an online event to be hosted on the famous programming website www.codechef.com through the NIT Hamirpur Codechef Campus" +
                    " Chapter 'Codemons' on 5th April,2015 at 21:00 PM-00:00 AM.\n" +
                    " The event will span over a period of 3 hours  on www.codechef.com\n" +
                    " It will consist of 5 programming problems that are to be compiled and submitted online.\n" +
                    " Any language can be used to solve th problems.\n",

            "Xquizzite is an online challenging event where contestants would have to pick a category of their choice from the given ones and then would have to answer " +
                    "10 questions based on the chosen category within the time limit of 10 seconds. Scores will be awared for the right answer (No negetive marking would be there " +
                    "for wrong answers). Score of the individuals will be recorded and then the contestant would have to challenge other contestants. The challenge would be sent randonly" +
                    "to any of the contestant. The challenged contestant would then answer the 10 questions of the challenge and their response would be recorded after comparing " +
                    "with the previous scores, the best of the two would be considered.\n Around ten contestants would be chosen in the prelims for the final round.\n" +
                    "THe final round would be logo quiz where the contestant would have to correctly name the logos. " +
                    "At the end the contestant with the highest score in the final round will be the winner.",


            "This is an Online event. Executable file will be mailed to the registered participants. Try any number of inputs to identify what program do and make " +
                    "a program for it, in the given time limit.The participant who will crack the problem in the minimum time would maximum points. \n" +
                    "Rules and Regulations\n" +
                    "1. This online event consists of only one Round.\n" +
                    "2. Each participating team consists of single member.\n" +
                    "3. Problems will be floated for four days.\n" +
                    "4. Teams will be provided with two executable output files daily (at 6 pm).\n" +
                    "5. Coding can be done in C/C++ that is compatible with gcc compiler.\n" +
                    "\n" +
                    "Judging Criteria\n" +
                    "\n" +
                    "1. Time of submission 12 noon (day of uploading problem) to 12 noon (Next Day).\n" +
                    "2. Last submission will only be checked.\n" +
                    "3. Submission will be in form of  two files (named as question number) :\n" +
                    "i) Text file including team’s name, participant roll no. and Logic behind the question.\n" +
                    "ii) c/cpp file containing code for your logic.\n" +
                    "4. Submit(mail) both files to teamexe15@gmail.com.",


            "This is an Online web desigining event.Participants will be given eight themes.The contestant can chose any one of the eigth themes and " +
                    "then would have to submit web pages based on the themes chosen by him/her.\n"+
                    "The description of every theme is given in the official page of the event.Self made appropriate web pages would be considered submitted within the given duration of time." +
                    "\nRules and regulations-\n" +
                    "1. Maximum of 2 members are allowed per team.\n" +
                    "2. Three days will be given to submit the particular problem.\n" +
                    "3. Only last submission will be checked.\n" +
                    "4. Submission will be in form of  a compressed folder (name the folder as theme_teamname):\n" +
                    "  \n" +
                    "Text file including team’s name and participants roll no.\n" +
                    "All the Source codes files linked together with a main page named as home.\n" +
                    "Make separate folders for images and coding files.\n" +
                    "5. In any circumstances, judge’s decision will be final and binding to all.\n" +
                    "6. Submit it to team.exe15@gmail.com\n",


            "Paradox is one of the most challenging contest \n" +
                    "that goes on during the technical extravaganza nimbus where the contestants put every bit of their wit to get the right answer.\n" +
                    "This is an online event which consist of around 30 levels played by individual contestant .\n" +
                    "The consequent levels open up after answering correctly former level. The game goes on clinging to higher level of difficulties " +
                    "as contestants proceed .the contestants have to make ample use of search engines info sites and wiki descriptions but of course along with there " +
                    "individual knowledge."

    };

    String[] online_coordinator = {
            "Mayank Bansal\n9736163688\n\nShubham Chaudhary\n8894730166", "Divjot Singh\n9882517991", "Mayank Bansal\n9736163688",
            "Ashima Anand\n8350843886\n\nNidhi Dhiman\n7831918628", "Divjot Singh\n" +
            "9882517991"
    };

    String[] offline_content={
            "\"trace the gold\" \n" +
                    "It is an event where the participating teams will have to hunt for the untraceable gold. They have to unlock a mystery in order " +
                    "find the hidden gold. It involves no coding only intuitive thinking. \n" +
                    "\n" +
                    "Specifications and Format of Event :-\n" +
                    "1. Event will be conducted in 2 stages.\n" +
                    "2. First stage of event will consist of a preliminary round consisting of 15 questions based on a movie clip of duration 20-30 minutes. After " +
                    "that each participating team will be given a time of 30min to solve the questions.\n" +
                    "3. Second stage of event will be a mystery solving event.\n" +
                    "\n" +
                    ">Participants will have to trace the gold by solving each question correctly that will take them to another level of mystery on a computer based interface. \n" +
                    ">Participant will have the internet to search the clues. \n" +
                    "\n" +
                    "Rules and Regulations :-\n" +
                    "1. Maximum of 2 members are allowed per team.\n" +
                    "2. The event is strictly based on efficient searching and intuitive thinking.\n" +
                    "3. Based on the performance of the teams in Preliminary Round, top 10-15 teams will be selected for the Final round.\n" +
                    "4. In the final round a team of two will be provided with only 1 computer to trace the gold.\n" +
                    "5. No external help other than internet will be provided.\n" +
                    "6. In any circumstances, judge's decision will be final and binding to all.\n" +
                    "\n" +
                    "Judgment Criteria :-\n" +
                    "1. The team that traces gold first will be the winner.\n" +
                    "2. In case no team is able to trace gold, team with the maximum score will be the winner.\n" +
                    "\n" +
                    "Resources :-\n Free use of internet",


            "This is a combined test of your aptitude and reasoning, general awareness, history and computers\n" +
                    "\n" +
                    "Specifications and Format of Event :-\n" +
                    "A team of atmost 2 members can participate in the event. This game will consist of G.K. and aptitude questions. Participants will be presented " +
                    "with 1 question and four possible answers to choose in each page. Correct answers will enable you to proceed to the next question with 30 marks " +
                    "added to your score while a wrong answer will result in deduction of 5 marks from your score in that question and you will be " +
                    "redirected to next page . The game will consist of lifelines. Each lifeline can be used only five times during the game and one lifeline can" +
                    " be used only once for a question\n" +
                    "\n" +
                    "Rules and Regulations :-\n" +
                    "1. Maximum of 2 members are allowed per team.\n" +
                    "2. The event is strictly based on reasoning, intuitive thinking and basic concepts.\n" +
                    "3. Based on the performance of the teams in Preliminary Round, top 10-15 teams will be selected for the Final round.\n" +
                    "4. In the final round a team of two will be provided with only 1 computer.\n" +
                    "5. No external help will be provided.\n" +
                    "\n" +
                    "Judgment Criteria :-\n" +
                    "1. In any circumstances, the score once analysed  by the interface of the event will be final and binding to all.\n" +
                    "2. The first scores shall be sent over TEAM.EXE's email address and no tampering of the interface shall be entertained.",


            "Code Hunt is an offline event in which five problems are provided. And the input to the first program is provided. The output of the first program " +
                    "is the input of the second and that of second is the input of third and so on. "+
                    "Participant has to find out the output of the fifth problem.",

            "This event consists of two rounds : prelims and mains. Preliminary round will consist of C and C++ based objective questions. " +
                    "In mains, contestants will have to understand a new programming language API and code problem statements in the same language within " +
                    "the given time.\n" +
                    "\n" +
                    "Specifications and Format of Event :-\n" +
                    "1. Event will be conducted in 2 stages.\n" +
                    "2. First stage of event will consist of a preliminary round consisting of C and C++ based objective questions, each participating team will be given a time of 30min to solve 30 objectives.\n" +
                    "3. Second stage of event will be coding based event.\n" +
                    "\n" +
                    ">Participants will be given 5-7 problem statements along with a new programming language API.\n" +
                    ">They have to understand the programming language API and code problem statements in the same language.\n" +
                    ">Teams will be provided with Linux operating system with installed compiler for the given language.\n" +
                    "\n" +
                    "Rules and regulations :-\n" +
                    "1. Maximum of 2 members are allowed per team.\n" +
                    "2. The prelims is strictly based on C and C++.\n" +
                    "3. Based on the performance of the teams in Preliminary Round, top 10-15 teams will be selected for the Final round.\n" +
                    "4. In the final round a team of two will be provided with only one computer to implement their code.\n" +
                    "5. In any circumstances, judge's decision will be final and binding to all.\n" +
                    "\n" +
                    "Judging criteria :-\n" +
                    "1. Complexity of code.\n" +
                    "2. Understanding of problem statement.\n" +
                    "3. Logic of the program code and stepwise analysis.",

            "Virtual Reality is the demonstration of the virtual reality using the virtual reality headsets like google cardboard. It is a complete different experience" +
                    "which people have in mind. It is more than just a screen in front your eyes. Only the people who have tried the headset knows what it's like, it cannot be explained" +
                    "which actually having the headset. So, we are giving you the oppurunity to try on the virtual reality headsets and experiance the world of " +
                    "virtual reality.",

            "Type Racer is a fun based typing competition. Participant will have to type given text on an old style typewriter where errors" +
                    " are not allowed. If participant is fast enough, to qualify for the second round, he will be tested on a never seen keyboard! Here " +
                    "the key to success are the keys only, get them all. \n" +
                    "\n" +
                    "Specifications and Format of Event :-\n" +
                    "1. Event will be conducted in 2 levels.\n" +
                    "2. Level 1 consists of typing on an old style typewriter. \n" +
                    "3. In level 2 typewriters will be replaced by a never seen keyboard.\n" +
                    "4. First 15 from level 1 will qualify for level 2.\n" +
                    "\n" +
                    "Rules and Regulations :-\n" +
                    "1. Maximum of 2 members are allowed per team.\n" +
                    "2. A team can take part more than one time for the same level.\n" +
                    "3. Team to type the given text in least time at the end of the day will win.\n" +
                    "4. Errors will add to the time taken, as a penalty.\n" +
                    "5. In any circumstances, judge's decision will be final and binding to all.\n" +
                    "\n" +
                    "Judgment Criteria :-\n" +
                    "1. Speed of typing.\n" +
                    "2. Accuracy in typing."


    };

    String[] offline_coordinate={
            "Aniket Verma\n8894192398",
            "Aniket Verma\n8894192398",
            "Mayank Bansal\n9736163688",
            "Mayank Bansal\n9736163688" ,
            "Team Event",
            "Divjot Singh\n9882517991"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);

        /**
         *Setup the DrawerLayout and NavigationView
         */

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.navbar) ;

        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         */

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView,new TabFragment()).commit();
        /**
         * Setup click events on the Navigation View Items.
         */

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();



                if (menuItem.getItemId() == R.id.nav_item_sent) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView,new EventsFragment()).commit();

                }

                if (menuItem.getItemId() == R.id.nav_item_inbox) {
                    FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                    xfragmentTransaction.replace(R.id.containerView,new TabFragment()).commit();
                }

                return false;
            }

        });

        /**
         * Setup Drawer Toggle of the Toolbar
         */

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
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

    public void clickZeroEvent(View view) {
        Intent in = new Intent(MainActivity.this, Description.class);
        in.putExtra("title", online_events[0]);
        in.putExtra("tagline", tagline_array[0]);
        in.putExtra("content", online_content[0]);
        in.putExtra("coordinator", online_coordinator[0]);
        in.putExtra("number", 0);
        startActivity(in);
    }
    public void clickFirstEvent(View view) {
        Intent in = new Intent(MainActivity.this, Description.class);
        in.putExtra("title", online_events[1]);
        in.putExtra("tagline", tagline_array[1]);
        in.putExtra("content", online_content[1]);
        in.putExtra("coordinator", online_coordinator[1]);
        in.putExtra("number", 0);
        startActivity(in);
    }


    public void clickSecondEvent(View view) {
        Intent in = new Intent(MainActivity.this, Description.class);
        in.putExtra("title", online_events[0]);
        in.putExtra("tagline", tagline_array[0]);
        in.putExtra("content", online_content[0]);
        in.putExtra("coordinator", online_coordinator[0]);
        in.putExtra("number", 0);
        startActivity(in);
    }

    public void clickThirdEvent(View view) {
        Intent in = new Intent(MainActivity.this, Description.class);
        in.putExtra("title", online_events[0]);
        in.putExtra("tagline", tagline_array[0]);
        in.putExtra("content", online_content[0]);
        in.putExtra("coordinator", online_coordinator[0]);
        in.putExtra("number", 0);
        startActivity(in);
    }
}

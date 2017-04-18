package com.example.hp.srijan;

import java.sql.Struct;

/**
 * Created by mayank on 03-03-2017.
 */
public class InformationClass {

    public InformationClass(){}

        public final int day_1[]={0,1,3,6,14,17};
        public final int day_2[]={4,5,8,12,13,16};
        public final int day_3[]={7,10,11,15};

        public final  int layout_ids[]={R.id.avalanche,R.id.paridhaan,R.id.ism_mun,R.id.rangmanch,R.id.hustleherd,
            R.id.unplugged,R.id.footloose,R.id.aaroh,R.id.hallabol,R.id.mr_and_ms_srijan,
            R.id.khamoshi,R.id.streetbeats,R.id.kavyanjail,R.id.reflection,R.id.coffee_cup,
            R.id.one_on_one_debate,R.id.stand_up_comedy,R.id.rang,R.id.hundred_seconds};

  public  final String events[]={"Avalanche - The Rock Band competition","Paridhan - The fashion show","ISM-MUN - Model United Nations.",
            "Rangmanch - The Stage Play Competion.", "Hustle-Herd - The group dance competition","Unplugged - The Acoustic Band Competition",
            "Footloose - The Solo Dance Competition","Aaroh - The Solo Singing Competition","Halla Bol - The Nukkad Natak competition","Mr. & Ms. Srijan",
            "Khamoshi - The Mime Competition","StreetBeats - The Street Dancing Competition","Kavyanjali - Hindi Poetry Competition","Reflection - Duo Dance Competition",
             "The Coffee Cup-English Poetry Competition","One-on-one Debate","Stand-up Comedy","Rang - Painting Competition","100 Seconds-Film making competition"};

        public final String events_subheadings[]={"The Rock Band competition","The fashion show","Model United Nations","The Stage Play Competion","The group dance competition",
        "The Acoustic Band Competition","The Solo Dance Competition","The Solo Singing Competition","The Nukkad Natak competition","",
        "The Mime Competition","The Street Dancing Competition","Hindi Poetry Competition","Duo Dance Competition","English Poetry Competition",
        "","","Painting Competition","Film making competition",};

    public  final String events_names[]={"Avalanche","Paridhan","ISM-MUN", "Rangmanch", "Hustle-Herd","Unplugged",
            "Footloose","Aaroh","Halla Bol","Mr. & Ms. Srijan",
            "Khamoshi","StreetBeats","Kavyanjali","Reflection",
            "The Coffee Cup","One-on-one Debate","Stand-up Comedy","Rang","100 Seconds"};

    public final String about_event[]={
            "Get ready to go off the rails on a crazy train!! A ride we call- AVALANCHE- the battle of bands at Srijan’17. If you think your music is hard and heavy, we will have an audience that’s hot and sweaty. So what are you waiting for? Plug in your guitar and blow ‘em off with your earsplitting riffs. Click here to go to our Facebook Page. \n" +
            "The event shall be held in two rounds:\n" +
            "i) Prelims (at Dhanbad, Ranchi, Kolkata, Guwahati and Kathmandu) and\n" +
            "ii) Finale (during Srijan)\n" +
            "For the dates and venues of our prelims, follow our facebook page or contact us at avalanche@srijaniitism.org.",

            "Paridaan - the fashion show of Srijan, has been the largest crowd-winner at Srijan every year. And this year, it'll surpass everything that has ever been seen with respect to it. \n" +
                    "It is a typical fashion show where contingents consisting of 8-16 members, who will get a fixed time on the stage where they will have to perform their act, which is in accordance with their their theme. They shall be judged as per the criteria decided by the judges. The contest will be held in two stages : \n" +
                    "Prelims and Finals.",

            "Model United Nations, also known as Model UN or MUN, is an educational simulation and/or academic competition in which students can learn about diplomacy, international relations, and the United Nations. MUN involves and teaches researching, public speaking, debating, and writing skills, in addition to critical thinking, teamwork, and leadership abilities. Participants in Model UN conferences, known as delegates, are placed in committees and assigned countries, or occasionally other organizations or political figures, where they represent members of that body. They are presented with their assignments in advance, along with a topic or topics that their committee will discuss. Delegates conduct research before conferences and formulate positions that they will then debate with their fellow delegates in the committee, staying true to the actual position of the member they represent. At the end of a conference, the best-performing delegates in each committee, as well as delegations, are sometimes recognized with awards ",

            "If you think you can you can mesmerize the audience with acting, script, dialogues and sets – then Rangmanch is your call! Once the stage is set and all is ready – it is show time!",

            "Cut–throat competition over the years has made ‘Hustle Herd’ one of the most sought- after and popular dance events. Hop on and mesmerize the crowd with your elegance, synchronization and style, and yeah! Don't forget to bring along your stash of exuberance and energy with it.",

            "The event shall be a competition between bands performing self-composed or cover songs without aid of electrical music instruments. The event shall be held in two rounds:\n" +
                    "i) Prelims (during Srijan) and\n" +
                    "ii) Finale (during Srijan)",

            "Footloose is ‘The Ultimate Solo Dance Face-off. It’s for those who think they can set ablaze the stage and steal the thunder, while others just sit and behold the phenomenal performances. This is undoubtedly the ultimate quest for the greatest of dancers.",

            "The battle of tunes! Are you the one who gets music ringing inside your head? Are you the one who can’t resist humming the moment music is played? Surely the stage of Sur Sangram is your resort. Prove your mettle in the coveted event and rise to fame with AAROH’17.\n" +
                    "The event will be divided into two sub-events:\n" +
                    "i) Eastern Vocals and\n" +
                    "ii) Western Vocals.\n" +
                    "divided into two parts- prelims and finals.",

            "Exploiting the power of a street gathering, Nukkads or street plays have been the medium of the voice of the people from time immemorial. Now be a part of this tradition and strive to bring about change by taking part in Nukkad, one of the most acclaimed street play competitions in India. It is time to break barriers so clear your voices, get ready for the action, drum it up, folks and let your message ring out loud!",
            " ",
            "“The art of mime encompasses all the feelings of the soul.” It’s the perfect time to bring out the silent actor hidden in you. We bring you a stage to perform this unique skills of your at your best and earn a honor of Mime Star from the Srijan’17 and earn prizes.",
            "Street Beats is the dance event with no confined dance floor. Just get up to the music playing in the air, and dance it off. Street Beats is the one street dancing event where you can prove your mettle, and show the hustling-bustling crowd that you’ve got inside what it takes to be one hell of a Street Dancer.",
            "How often have you had lyrics lingering in your mind, tickling your brain to pen it down? \n" +
                    "You seek a moment to scribble it, read it, cherish it, and then treasure it. At times your work is so impounding that you want to just shout it out loud. This Srijan, we give you the opportunity to pour your heart out in front of everyone. So, take your pens out of your scabbards and show us what you got….!! \n" +
                    "This is a simple poem recitation event. The participants will have to recite a self-written poem on-stage. They will be judged on the basis of all the aspects regarding the content as well as their recitation skills.",
            "Awe-inspire us with your chemistry and mesmerize us with your synchronization. Explore the versatile realm of duet dancing in this latest addition to the choreo events, Just Duet! Grab a partner, prepare a routine and compete to become the best dancing jodi. Note: There is no gender restriction whatsoever. There is only one round in this event. The couple will have to perform a prepared routine of maximum 3 minutes. Based on the performances, the results will be declared. There is no gender restriction. Two boys, two girls or one boy-one girl can participate as a pair.",

            "Ahoy! All poetic lads. Welcome aboard the ship that sails the river of thoughts and fights the chaotic emotions, to gently go through peaceful renditions. It’s the one place for all the budding poets to showcase their hidden maestros. Make sure that the arsenal is ready as the slams will be of a whole new and different level. Join us this Srijan’17 for the very first Poetry Slam",

            "The event is a classic 1 on 1 debate (Because, well, nobody needs team mates, right?) in the following format. If you need a little insight, you may watch the recent ones of Trump and Clinton (:P). The language for the debate will be invariably English.",

            "We don’t forget to give all the young comedians out there a platform to tickle the audience with the best of their comic skills. Be the reason for all the giggles and laughs around, and more importantly, be the best of all and go home with a prize.",

            "Let your passions play through your paintings at Srijan’17. Make use of Rang to create and exhibit the beauty of your thoughts and artistry of your hands WITHOUT BRUSHES. Participate to bring back all your childhood skills.",

            "100 seconds is an online film making competition with no theme boundations. Upload your entries on a file upload portal and send the link to online@srijaniitism.org."
           };


    public final String rule_event[]={
            "i)\tA team can have a minimum of 3 members.\n" +
            "ii) Time given per team :-\n" +
            "A) Prelims-15 mins.\n" +
            "B) Finals-20 mins.\n" +
            "iii) The band has to arrange its own musical equipment. A set of drum kits, speakers, sufficient no. of microphones and connecting chords will be provided. iv) Use of any dangerous prop (ex. fire, pointed objects etc.) is strictly prohibited.",

            "GENERAL RULES \n" +
                    "1)Each team must be composed of 8 to 16 members. The team can contain both boys and girls \n" +
                    "2) No person shall be allowed to be a part of multiple teams. \n" +
                    "3) Swapping or changing of the team member is prohibited. \n" +
                    "4) No obscenity of any kind shall be tolerated. \n" +
                    "5) The teams are allowed to get sponsors for their dresses. \n" +
                    "6) In case of any discrepancies or conflicts, the word of the organizing committee shall be final and binding. \n" +
                    "\n" +
                    "PRELIMS: \n" +
                    "Prelims shall be held to filter out the best teams among all. A total of 8 teams shall qualify from the Prelims and will participate in the finals. \n" +
                    "\n" +
                    "Rules: \n" +
                    "1) Every team is free to perform on any theme they decide upon. Their theme shall be announced on the stage as well. However the theme should be visible as the contingent performs. \n" +
                    "2) For the use of props (if any), the teams must consult the organizing committee beforehand. \n" +
                    "3) Every team shall get minimum 7 and maximum 12 minutes to perform on stage. \n" +
                    "4) The teams need to submit their music track before the event. \n" +
                    "\n" +
                    "Finals : \n" +
                    "The teams that qualify the Prelims shall perform in the finals. 1) For finals, the teams shall get a theme, which shall be disclosed beforehand. \n" +
                    "2) For the use of props (if any), the teams must consult the organizing committee beforehand. \n" +
                    "3) Every team shall get minimum 8 and maximum 16 minutes to perform on stage. \n" +
                    "4) The teams need to submit their music track before the event. \n" +
                    "Disobeying the rules shall attract heavy penalty, and disqualification.",

                     "ISM MUN is proud to present ISM Model United Nations 2017 on 25th and 26th March 2017.\n" +
                             "Committees to be simulated this year are :-\n" +
                             "Joint Crisis Council (JCC) : Two different groups of delegates, each utilising crisis procedure, battle it out against each other using strategy, subterfuge, and diplomacy for supremacy over the other.\n" +
                             "Historical United Nations Security Council (HUNSC) : Will the political essence of the clashes and mutual ambitions take over the world peace goal? The members of the Security Council are to prove not only the SC actions, but the necessity of existence of the UN.",

            "1. This is a group event. Each team should have a minimum of 5 actors. In addition there can be 1 person in charge of music and a maximum of 3 people for lights. \n" +
                    "2. The event will take place in 2 rounds, prelims and finals. Total time allotted for each team in the prelims is 15 minutes and for the finals is 50 minutes.\n" +
                    "3. Language of the play can be English/Hindi. Mime is allowed.\n" +
                    "4. Stage area: 20ft x 36ft (approx.)\n" +
                    "5. The teams will be informed regarding their lights practice and prelims slots by email. \n" +
                    "6. The time duration for prelims and finals includes performance time and stage setting time. The given time duration is from empty stage to empty stage. \n" +
                    "7. In the finals, if a team exceeds 50 minutes, 15% of the total marks obtained will be deducted. If a team exceeds 55 min, it stands to be debarred from the event. \n" +
                    "8. Microphones and backstage mikes for narration, lights, and a laptop to play sounds will be provided.\n" +
                    "9. Recorded vocals are not allowed, only instrumental music is allowed.\n" +
                    "10. The teams are expected to bring their own music on CD or pen drive for the play.\n" +
                    "11. In case of malfunctioning of any equipment provided, the team will be allowed to repeat their performance from the last scene change or from the point of disruption that the team wishes. It depends on the judges’ discretion as to how much grace time will be given to the performing team.\n" +
                    "12. All costumes and accessories are to be arranged by the participating team. The organizing committee is responsible for the infrastructural facilities only and shall not be responsible for the security of items left behind in green rooms or on stage after the performance. \n" +
                    "13. Requests for special effects and props should be communicated at least a week in advance by both email and over the telephone. The same will be provided only if possible. \n" +
                    "14. No naked flames or live animals are allowed on stage. \n" +
                    "15. The participating teams are requested to ensure that their presentation is in keeping with the dignity of the fest. \n" +
                    "16. The judges’ decision will be final and binding. \n" +
                    "17. The organizing team reserves the right to change or modify any of the rules. ",

             "1. A team should have a minimum of 5 active members on the stage. \n" +
                     "2. The time limit of the performance will be minimum 7 minutes and maximum 10 minutes. (Music on to off) \n" +
                     "3. Participants should get their songs/music on a CD and a pen-drive. Team Srijan will not be responsible for any kind of data error that happens on your pen-drive, so it’s advised that you have a back up in a CD. \n" +
                     "4. In case of malfunctioning of any equipment provided, the team will be allowed to repeat their performance from the beginning or from the point of disruption, as the team wishes, with the consent of the judge. \n" +
                     "5. Stage Specifications: Stage Area: 20ft*15 ft (approx). \n" +
                     "6. All costumes, props and accessories have to be arranged by the participating team. Naked flames, perilous tools, lamp, or animals are strictly not allowed. \n" +
                     "7. The music to be used must be submitted to the organizers in a form compatible with Windows Media Player (Preferably .mp3 format), at least an hour before the event. \n" +
                     "8. The participating teams are requested to ensure that their performance is in keeping with dignity of the fest. Any kind of over-the-line profanity or vulgarity will lead to disqualification. ",

            "i)\tEach band must have a minimum of three members. \n" +
                    "ii) Each band will be provided 20 mins (including sound check) and overshooting the time limit will result in deduction of marks.\n" +
                    "iii) No electric instruments are allowed.(Keyboards can be used in grand piano mode only). \n" +
                    "iv)\tA set of drum kits, speakers, sufficient no. of microphones and connecting chords will be provided. ",


            "a)Prelims \n" +
                    "1. Offline prelims shall be conducted in the college campus on the very first day of the fest. \n" +
                    "2. Online prelims will also be conducted through which the participant will have to send a link of their video performance to : submit@srijaniitism.org. \n" +
                    "3. The time duration of the performance has to be strictly between 1.5 minutes and 3 minutes. (Music on and off inclusive). \n" +
                    "4. All dance forms are equally welcomed. \n" +
                    "b)Finals: \n" +
                    "1. Finals shall be conducted right after the prelims are over. The shortlisted online participants will be informed earlier through a mail or call. \n" +
                    "2. The individual must bring the audio track in a pen-drive or hard disk in ‘.mp3’ format, and submit it at the time of confirmation of registration at the event venue. \n" +
                    "3. Time limit is between 2 minutes and 3 minutes. (Music on an off inclusive) \n" +
                    "4. Marks will obviously be deducted if the performance exceeds the time limit. \n" +
                    "5. Use of flame or fluid on stage, lighting of candles, matches or cigarettes is strictly NOT allowed and will lead to immediate disqualification. However, in case of special prop requirements such as chairs, etc, the participants will have to inform the organizers in advance.",


            "i)\tTime limit for prelims is 3 minutes and 5 minutes for the finals.\n" +
                    "ii) Participants have to bring their karaoke tracks or they can have their own accompanists(a maximum of 2 other than the participant). ",



            "1. The event will take place in 2 rounds, prelims and finals. \n" +
                    "2. Teams are expected to perform at an open air venue, on a circular stage with audience on all sides. \n" +
                    "3. The team shall consist of maximum of 20 people and a minimum of 8 people excluding 2 instrumentalists (optional). \n" +
                    "4.The time limit shall be 10 minutes for the prelims and for the finals, it shall be 20 minutes. \n" +
                    "5. In case of violation of the time limit, participants will be penalized by the judges. The time duration for prelims and finals includes performance time and stage setting time. The given time duration is from empty stage to empty stage. \n" +
                    "6. Usage of fire, water or smoke is not allowed. \n" +
                    "7. Gulaal, if used, must be dusted off by the participants after their performance within the 20 minutesperformance time allotted to them. \n" +
                    "8. Any instance of vulgarity or disturbing content of any order will lead to forceful halt of performance and immediate disqualification. \n" +
                    "9. Only live music is allowed. Teams will have to bring their own instruments. \n" +
                    "10. 30 % - Content, 25 % - Acting/ Expression, 20 % - Audience Response, 15 % - Direction, 10 % - Miscellaneous Effects. \n" +
                    "11. The judges’ decision will be final and binding. \n" +
                    "12. The organizing team reserves the right to change or modify any of the rules. ",
            " ",
            "The competition will consist of one round: \n" +
                    "1. Each team can have maximum of 15 members. \n" +
                    "2. Time limit is 12 minutes (empty stage to empty stage) for each team. 3. Negative points for exceeding the time limit. \n" +
                    "4. The act should not contain any dialogues or lip sync. \n" +
                    "5. No act shall contain any offensive, obscene, disrespectful actions or gestures. The act will be immediately stopped and the entry will be disqualified, if these instructions are not followed. \n" +
                    "6. Points will be given on the basis of innovation, depiction of the situation, team work and expressions.",
            "Participants must strictly follow any of the following styles: Hiphops, Poppings, Tutting, Krumping, Break-Dance , Stepping, B-boying, Contraptions, and Western Free Style. Team size: 4-10. \n" +
                    "\n" +
                    "PRELIMS : \n" +
                    "1. Time limit: 4–6 minutes (Length of the music track) \n" +
                    "2. Live Music is not allowed. \n" +
                    "3. All costumes and accessories have to be arranged by the participating team. Naked flames & Live animals are not allowed. \n" +
                    "4. Participants should get their songs/music on a CD and a pen-drive. \n" +
                    "5. In case of malfunctioning of any equipment provided, the team will be allowed to repeat their performance from the beginning or from the point of disruption, as the team wishes, with the consent of the judge. \n" +
                    "6. The decision of judges and the organizing team will be final and binding. \n" +
                    "\n" +
                    "FINALS: \n" +
                    "1. At the time of spot registration, each team would be provided with three music tracks (1+1+1 minutes) for preparation. Teams are supposed to bring their own portable music players. Different teams would be provided with different music tracks. \n" +
                    "2. The teams are to choreographed and prepared to dance to the music tracks provided to them. The total performance duration of each team would be 3 minutes. \n" +
                    "3. During the event, every 2 teams will be grouped together and given a slot. The music tracks of the team in a slot will all be shuffled and played continuously. The team should be ready and should perform whenever their allotted tracks are played. \n" +
                    "4. The one minute of each performance would be considered from empty stage to empty stage i.e. the entry onto and the exit from the stage would be included in the performance. \n" +
                    "5. It is not necessary that all the members of the team should perform all the times. \n" +
                    "6. Stage specifications: 360 degree open and enough area. \n" +
                    "7. In case of malfunctioning of any equipment provided, the team will be allowed to repeat their performance from the beginning or from the point of disruption, as the team wishes, with the consent of the judge. \n" +
                    "8. All costumes and accessories have to be arranged by the participating team. Naked flames & live animals are not allowed. \n" +
                    "9. The participating team are requested to ensure that their presentation is in keeping with the dignity of the fest. \n" +
                    "10. The decision of judges and the organizing team will be final and binding.",
            "1. The content should be original. \n" +
                    "2. The poem has to be in hindi only. \n" +
                    "3. Use of offensive words is strictly prohibited. \n" +
                    "4. It should not be offensive to any person, sect or institution. \n" +
                    "5. The poem should be of such a length that it can be recited in less than 10 minutes. \n" +
                    "6. Marks will be awarded on the basis of creativity, originality, language, presentation etc. \n" +
                    "7. Contestants are also requested to submit their poem in written form to the judges for ease in judgement. \n" +
                    "8. Violation of any rule may lead to direct disqualification.",

            "1. Every participant should submit their track, at the time of registration, to the event coordinators in a pen drive. \n" +
                    "2.The name of the track should be the participant’s name followed by the college name. - Time limit is 2-3 minutes. \n" +
                    "3. Inflammable objects, water and heavy props are NOT allowed in the competition. \n" +
                    "4.Indecent behavior on stage shall not be tolerated and may lead to instant disqualification. \n" +
                    "5. Judges’ and coordinators’ decision will be final and binding. There shall be no argument in this regard.",

            "1.It will be an individual event. \n" +
                    "2.Each poem must be the poet’s own. Claims of plagiarism will be taken into consideration very seriously, and may result in disqualification of said candidate. \n" +
                    "3.All forms of performance poetry such as spoken word, theatre and cold heart poetry etc. are welcome. \n" +
                    "4.There will be two rounds, the first one being the Preliminaries, and the second, the finals. \n" +
                    "5.In the Preliminaries, each poet gets three minutes (plus a ten-second grace period for the poet's introduction) to recite one poem. If the poet goes beyond the stipulated time period, for every ten second overshoot, 5 point will be deducted from the total score. \n" +
                    "6.Only ONE poem may be presented per round. Should the poet present more than one, only the first one will be taken into consideration by the judges . \n" +
                    "7.The poet may not use props, costumes or musical instruments, but is free to handle the stage and microphone according to his or her will \n" +
                    "8.The poet is free to read out his or her poem from a sheet of paper or any electronic device, but is advised against it. \n" +
                    "9.In the final round, participants will be allowed to speak for 4 minutes only. The participants may NOT in any manner whatsoever directly interact with the judges prior to the conclusion of the event. Failing to do so can result in immediate disqualification. \n" +
                    "10.Only ENGLISH poems will be allowed. Usage of any other language for any purpose save artistic license ",

            "There will be two sides – a proposition and an opposition. A coin will be tossed to decide the roles, following which three topics shall be provided. The participants will mark their preferences against each topic. Finally, the topic with the highest cumulative preference shall be discussed. The debate shall proceed as follows: First, the proposition speaker speaks for 2 minutes, wherein he/she will present his/her points. Then, the opposition speaker speaks for 4 minutes, wherein he/she will present his/her points and counter the points provided by the proposition. Finally, the proposition speaks again for 2 minutes wherein he/she builds his/her case further and counters the points presented by opposition. Finally, there will be a question round and a conclusion round. Via a toss, the winner gets to decide whether he/she will deliver the conclusion first or ask the questions first. Then, the debate shall proceed to Question Round, where each participant gets 1 minute to ask at most 2 questions from the opposite side. Finally, each side presents a 15 seconds conclusion. This marks the end of the debate. Judges shall be provided by the institute only, and their verdict shall be final and binding. The participants can, however, ask for reviews from the judges. But that will be under unofficial capacity. Through a simple elimination method, the winner, the runner-up, and the second runner-up shall be decided.",

            "1. It is an individual/group competition. \n" +
                    "2. Limited entries based on ‘first come, first served’ basis. \n" +
                    "3. Time limit is 8 Minutes. \n" +
                    "4. Negative marks on exceeding the time limit. \n" +
                    "5. No participant can point out any individual without prior permission. \n" +
                    "6. Decision of the judges will be final and binding.",




            "1. Team size: Minimum of 2 participants.\n" +
                    "2. Time limit: 3 hours. \n" +
                    "3. Participants need to paint on a huge canvas on a given theme, without making use of brushes. \n" +
                    "4. The participants have to make use of the materials provided only. \n" +
                    "5. The collection of votes from the audience will be on-the-spot. \n" +
                    "6. Medium- Acrylic Color. Materials provided will be Acrylic colors, Canvas, Pencil, Eraser, Cutter and Sharpener, Hard sheet, A4 rough sheet, and Tissue paper.",

            "1) The maximum length of your movie should be 100 seconds ONLINE. \n" +
                    "2) It is NOT theme based. Accepted genres : Fiction, Documentary, Animation, Experimental. \n" +
                    "3) Submission deadline : March 22nd 2017 \n" +
                    "4) Registration fee: NO FEE. \n" +
                    "5) Subtitle is required in English (If other than english or hindi) \n" +
                    "6) Upload via any online file sharing portal and send in the link to online@srijaniitism.org with the subject \"100 Seconds - *team name* \"."

    };


    public final String contacts_event[]={
            "Shrish Chandra Pandey \n" +
            "avalanche@srijaniitism.org \n" +
            "+91-9852601657\n" +
            "\n" +
            "Prakhar Agarwal \n" +
            "prakharagarwala7147@gmail.com \n" +
            "+91-9576033665",

            "Rajan Raju \n" + "info@srijaniitism.org \n" + "+91 8804718771",

            " ",

            "+91-7870387992 \n" +
                    "drama@srijaniitism.org",

            "dance@srijaniitism.org \n" +
                    "+91-8959446334",

            "Rajesh Kumar \n" + "rajesh@srijaniitism.org \n" + "+91-9031377234",

            "Kumar Satyajeet \n" +
                    "dance@srijaniitism.org \n" +
                    "+91-9852159169",

            "Rajesh Kumar \n" +
                    "rajesh@srijaniitism.org \n" +
                    "+91-9031377234",

            "+91-7870387992 \n" +
                    "drama@srijaniitism.org",
            " ",
            "+91-7870387992 \n" +
                    "drama@srijaniitism.org",
            "dance@srijaniitism.org \n" +
                    "+91-8959446334",
            "kavyanjali@srijaniitism.org \n" +
                    "+91-8877926813",
            "dance@srijaniitism.org \n" +
                    "+91-8959446334",

            "caffeinatedpoetry@gmail.com \n" +
                    "+91-7294874991",

            "literary@srijaniitism.org \n" +
                    "+91-9097431381",

            "Rishabh Mehta \n" +
                    "literary@srijaniitism.org \n" +
                    "+91-9461264886",

            "finearts@srijaniitism.org \n" +
                    "+91-7277474611",

            "online@srijaniitism.org \n" +
                    "+91-7765038414"
             };

    public final String judging_event[]={
            "i) Coordination \n" +
                    "ii)\tStage Presence \n" +
                    "iii) Sound Clarity \n" +
                    "iv) Quality of vocals \n" +
                    "v) Time Efficiency \n" +
                    "\n" +
                    "The decision of the jury shall be final and irrevocable. In case of any confusion about the rules, the comprehension of rules as stated by the organizers shall be final.",

            "1. Stage Presence. \n" +
                    "2. Coordination \n" +
                    "3. Garment Selection. \n" +
                    "4. Audience response.",

            " ",

            "1.40% - Content, 30% - Acting/Expression, 20% - Direction, 10% - Miscellaneous. \n" +
                    "2. Clarity (of idea). \n" +
                    "3. Presentation skills. \n" +
                    "4. Ability of expression. \n" +
                    "5. Reception by the crowd. \n" +
                    "6. Overall appeal",

            "1. Choreography. \n" +
                    "2. Co-ordination and Synchronization. \n" +
                    "3. Costumes and Props. \n" +
                    "4. Expressions. \n" +
                    "5. Stage utilization \n" +
                    "6. Overall Impact. \n" +
                    "The decision of judges and the organizing team shall be final and binding.",

            "i)\tStage presence.\n" +
                    "ii)\tAudience Response.\n" +
                    "iii) Originality.\n" +
                    "iv)\tVariety of Instruments.\n" +
                    "\n" +
                    "The decision of the jury shall be final and irrevocable. In case of any confusion about the rules, the comprehension of rules as stated by the organizers shall be final.",

            "1.Choreography. \n" +
                    "2.Stage utilization. \n" +
                    "3.Costume and Expression. \n" +
                    "4.Energy Level and Vibrance. \n" +
                    "5.Innovation and Special Techniques.\n" +
                    "6.Overall impact on the audience.",


            "i)\tVoice quality \n" +
                    "ii)\tRange \n" +
                    "iii) Versatility \n" +
                    "iv)\tPresentation \n" +
                    "v) Stage presence \n" +
                    "\n" +
                    "The decision of the jury shall be final and irrevocable. In case of any confusion about the rules, the comprehension of rules as stated by the organizers shall be final.",

            "1. 30 % - Content, 25 % - Acting/ Expression, 20 % - Audience Response, 15 % - Direction, 10 % - Miscellaneous Effects. \n" +
                    "2. Clarity (of idea) \n" +
                    "3. Presentation skills. \n" +
                    "4. Ability of expression. \n" +
                    "5. Reception by the crowd. \n" +
                    "6. Overall appeal",
            " ",
            "1. Costumes and Props. \n" +
                    "2. Clarity (of idea) \n" +
                    "3. Presentation skills. \n" +
                    "4. Ability of expression. \n" +
                    "5. Reception by the crowd. \n" +
                    "6. Overall appeal",
            "1. Choreography. \n" +
                    "2. Co-ordination and Synchronization. \n" +
                    "3. Costumes and Props. \n" +
                    "4. Expressions. \n" +
                    "5. Stage utilization \n" +
                    "6. Overall Impact. \n" +
                    "The decision of judges and the organizing team shall be final and binding.",
            "1. Originality of the content. \n" +
                    "2. Clarity (of idea). \n" +
                    "3. Presentation skills. \n" +
                    "4. Ability of expression. \n" +
                    "5. Reception by the crowd. \n" +
                    "6. Overall appeal.",

            "1.Co-ordination. \n" +
                    "2. Stage Utilization \n" +
                    "3. Choreography \n" +
                    "4. Expressions \n" +
                    "5. Overall impact \n" +
                    "6. Partner Chemistry \n" +
                    "7. Usage of Props.",

            "1. Originality of the content. \n" +
                    "2. Clarity (of idea). \n" +
                    "3. Presentation skills. \n" +
                    "4. Ability of expression. \n" +
                    "5. Reception by the crowd. \n" +
                    "6. Overall appeal. ",
            "1. Strength and weight of the argument. \n" +
                    "2. Eloquence in oration. \n" +
                    "3. Speaking under the stipulated time, crossing of which shall lose you marks. \n" +
                    "4. Preventing Rambling. \n" +
                    "5. Expression and Overall impact. \n",

            "1. Content. \n" +
                    "2. Fluency. \n" +
                    "3. Spontaneity and Expression. \n" +
                    "4. Presentation & Sense of humor. \n" +
                    "5. Overall impact and audience response.",

            "1. Creativity and Theme Projection. \n" +
                    "2. Color Impact and Finishing. \n" +
                    "3. Overall impact. (1+2+3=80%) \n" +
                    "4. Audience Votes. (=20%)",


            "1)Total 100 marks Concept - 20 marks Cinematography - 20 marks Editing - 20 marks Overall Impact - 20 marks Creativity - 20 marks \n" +
                    "2) Positions will be decided on the basis of the total marks. \n" +
                    "3) The content of the movie should be appropriate for public screening and thus should have no kind of vulgarity or obscenity."

    };

    public final String prize_event[]={
            "Total prizes worth 3,50,000 including cash, album contracts, recordings etc. More to be updated soon.",
            "To be updated soon.",
            "PRIZES WORTH INR 30,000 TO BE WON! ",
            "To be updated soon.",
            "To be updated soon.",
            "To be updated soon.",
            "To be updated soon.",
            "To be updated soon.",

            "To be updated soon.",
            "To be updated soon.",
            "To be updated soon.",
            "To be updated soon.",
            "To be updated soon.",
            "To be updated soon.",

            "To be updated soon.",

            "To be updated soon.",

            "To be updated soon.",

            "To be updated soon.",
            "To be updated soon."

    };

    public final String location_event[]={"OAT","Penmen Auditorium"," ","GJLT","Penmen Auditorium",
                                     "OAT","Penmen Auditorium","Penmen Auditorium","Upper Ground"," ",
                                 "GJLT","SAC(Badminton Court)","GJLT","Penmen Auditorium","Management Hall",
                             "Management Hall","GJLT","SAC(Badminton Court)"," "};

    public final int day_event[]={24,24,0,24,25,
                                  25,24,26,25,0,
                                  26,26,25,25,24,
                                  26,25,24,0};

    public final int hour_event[]={9,14,0,12,13,
                                   9,9,9,9,0,
                                   14,9,12,9,9,
                                   9,9,12,0};

    public final int minute_event[]={45,45,0,45,45,
                                    45,45,45,45,0,
                                   45,45,45,45,45,
                                   45,45,45,0};



}



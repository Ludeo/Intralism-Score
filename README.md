# General Information
I have started using Google Sheets to keep track of my scores in Intralism so I can see where I am missing points on an stuff like that. But using Google Sheets you have to update it yourself every time you did a new score and creating a Google Sheet for someone else also took some time. So I came up with the idea to write a program that automatically gets the scores from a user.

Before you start the program, make sure that you have Java installed. When you start the program you have to click on the textfield and then post the link of an Intralism player in there, for example: https://intralism.khb-soft.ru/?player=SteamID (you have to change the SteamID to the SteamID of the user you want to check so the ID thats shown in the profile URL). Then two windows will open, one is the players profile and the other one is a table with all of your scores. 
  
In the profile window you will see your global rank, your country rank, your average misses and your average accuracy, the points you have according to your profile, the points you actually have (when broken maps would get fixed), the maximum points you can reach, the difference between your points and the maximum points, the number of 100% plays you have and the total amount of maps.

In the scores window you will see the map name and your score, your acc, your miss count and your points on the map and also the maximum points you can get, the difference between your points and the maximumpoints and you can see if a map is broken or not. If a map is broken it means that if you have the full score on the map then you won't get the maximum points (you can only reach maximum points - 0.01). For example a map has 15 points as maximum points and the map is broken that means if you have full score you will only get 14.99 points.

When you want to compare players to each other you can just change the link and click the button again. Then two new windows will open and the program will only close when you close the window where you can put the link in.

I hope this program helps you out and if you have any suggestions or feedback it would be nice if you could let me know. You can reach me on Discord (Ludeo#8554) where you can also ask me questions if you have any.

Special Thanks to FlyingRabidUnicornPig (https://github.com/FlyingRabidUnicornPig) for helping me out with the code and also Special Thanks to Kiri (Kiri#0001) for checking the maximum points on every map I wasn't able to check.

# Updating the Score Checker
Since v2.0.1 the score checker uses a CSV-file. In this file every map is saved in the following format:
      mapname,maxpoints,brokenstatus,workshopid
For example:
      Camellia - K.Y.A.F.A,46.92,idk,2180608464
      
Each map has it's OWN line in the file. That means if you add a map, make sure to press enter on the end of the file. Also, make sure that you follow the exceptions below:      

If the map name contains a quote character, you need to replace it with QUOTE. Example:
      Yooh - "MariannE " --> Yooh - QUOTEMariannE QUOTE
      
If the map name contains a comma character, you need to replace it with COMMA. Example: 
      X&G - Whiplash ft, josh pan (sakuraburst Remix) --> X&G - Whiplash ftCOMMA josh pan (sakuraburst Remix)
      
If you don't change those two characters if you are adding maps yourself, then the score checker won't work properly. You don't have to add the maps yourself though. If new maps are released, I am going to post the lines you have to add in the file on the official Intralism discord and I am also going to update the maps.csv file here on Github. If I take too long for that and you still want to add them yourself, then follow the format above and you are good. Also, if you do want to add a new map and you are not sure if it is broken or not, then just use the brokenstatus idk. It appears sometimes in the mapfile because nobody I asked knows if it is broken or not. So if you discover a map that has the broken status and you FOR SURE know that it is broken or that it is not broken, let me and other players know on the official Intralism discord.

Link to the official Intralism discord: https://discord.com/invite/intralism

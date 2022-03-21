package classVC.util.lyrics.*
import lyrics.ovh.Database.*
import discordLyrica.Youtube.Lyric.*
public void class Server(name, article) {
client.LyricsOvh.Search(name, article)// YouTube And Spotify 
DiscordLyrica.StartSession(name, article)// DiscordLyrica Support: http://lyrica.discordlyrica.com
}
/*

DiscordLyrica Usage:
Import DiscordLyrica From Platform App Music Player

Use DiscordLyrica.StartSession To Search you Song
Use DiscordLyrica.Cast To Send a Broadcast using DiscordLyrica On Discord 
 Cast Session 
Cast a Send a Database Of Song and Send the bot [DiscordLyrica Bot Verified]


Lyrics.Ovh API Usage:
Import Lyrics.Ovh Database Or Lyrics.Ovh API Our Java

Use API Class or Client Class 

Class:
API = Our Platform
Client = Terminal You PC
*/

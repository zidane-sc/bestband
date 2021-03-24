package com.scproduction.bestband;

import java.util.ArrayList;

public class BandsData {
    private static String[] bandNames = {
            "AC/DC",
            "Aerosmith",
            "Bon Jovi",
            "Eagles",
            "Guns N' Roses",
            "Nirvana",
            "Oasis",
            "Queen",
            "The Rolling Stones",
            "The Beatles",
    };

    private static String[] bandGenre = {
            "Genres: Hard rock, Blues rock, Heavy metal, Rock and roll",
            "Genres: Hard rock, Blues rock, Rock and roll, Glam metal, Heavy metal",
            "Genres: Hard rock, Glam metal, Arena rock, Pop rock",
            "Genres: Rock, Country rock, Soft rock, Folk rock",
            "Genres: Hard rock, Heavy metal",
            "Genres: Grunge, Rock alternatif",
            "Genres: Rock, Britpop",
            "Genres: Rock",
            "Genres: Rock, Blues",
            "Genres: Rock, Pop music, Psychedelic rock, Blues",
    };

    private static String[] bandYearsActive = {
            "Years Active: 1973 – present",
            "Years Active: 1970 – present",
            "Years Active: 1983 – present",
            "Years Active: 1971 – 1980, 1994 – present",
            "Years Active: 1985 – present",
            "Years Active: 1987 – 1994",
            "Years Active: 1991 – 2009",
            "Years Active: 1970 – present",
            "Years Active: 1962 – present",
            "Years Active: 1960 - 1970",
    };

    private static String[] bandMember = {
            "Angus Young, Brian Johnson, Cliff William, Malcolm Young, Bon Scott, Stevie Young, Chris Slade",
            "James Hetfield, Lars Ulrich, Kirk Hammett, Robert Trujillo, Dave Mustaine, Ron McGovney, Cliff Burton, Jason Newsted",
            "Jon Bon Jovi, David Bryan, Tico Torres, Phil X, Hugh McDonaldAlec John Such, Richie Sambora",
            "Don Henley, Joe Walsh, Timothy B. Schmit, Glenn Frey, Bernie Leadon, Randy Meisner, Don Felder",
            "Axl Rose, Duff McKagan, Slash, Dizzy Reed, Richard Fortus, Frank Ferrer, Melissa Reese",
            "Kurt Cobain, Dave Grohl, Krist Novoselic, Pat Smear",
            "Liam Gallagher, Noel Gallagher, Paul Arthurs, Paul McGuigan, Tony McCarroll, Andy Bell, Alan White, Gem Archer",
            "Freddie Mercury, John Deacon, Brian May, Roger Taylor",
            "Mick Jagger, Keith Richards, Charlie Watts, Ronnie Wood",
            "John Lennon, Paul McCartney, George Harrison, Ringo Starr",
    };

    private static String[] bandInformation = {
            "AC/DC are an Australian rock band formed in Sydney in 1973 by Scottish-born brothers Malcolm and Angus Young. Although their music has been variously described as hard rock, blues rock, and heavy metal, the band themselves call it simply \"rock and roll\". AC/DC underwent several line-up changes before releasing their first album, High Voltage, in 1975. Membership subsequently stabilised around the Young brothers, singer Bon Scott, drummer Phil Rudd, and bass player Mark Evans. Evans was fired from the band in 1977 and replaced by Cliff Williams, who has appeared on every AC/DC album since Powerage (1978). In February 1980, over six months after the release of the follow-up album Highway to Hell, Scott died of acute alcohol poisoning.",
            "Aerosmith is an American rock band formed in Boston, Massachusetts in 1970. The group consists of Steven Tyler (lead vocals), Joe Perry (guitar, vocals), Tom Hamilton (bass), Joey Kramer (drums) and Brad Whitford (guitar). Their style, which is rooted in blues-based hard rock, has come to also incorporate elements of pop rock, heavy metal, and rhythm and blues, and has inspired many subsequent rock artists. They are sometimes referred to as \"the Bad Boys from Boston\" and \"America's Greatest Rock and Roll Band\". As a partnership, the primary songwriting team of Tyler and Perry is often collectively known as the \"Toxic Twins\".",
            "Bon Jovi is an American rock band formed in 1983 in Sayreville, New Jersey. It consists of singer Jon Bon Jovi, keyboardist David Bryan, drummer Tico Torres, guitarist Phil X, and bassist Hugh McDonald. Previous bassist Alec John Such was dismissed in 1994, and longtime guitarist and co-songwriter Richie Sambora left in 2013. In 1984 and 1985, Bon Jovi released their first two albums and their debut single \"Runaway\" managed to crack the Top 40. In 1986, the band achieved widespread success and global recognition with their third album, Slippery When Wet, which sold over 20 million copies and included three Top 10 singles, two of which reached No. 1.",
            "The Eagles are an American rock band formed in Los Angeles in 1971. The founding members were Glenn Frey (guitars, vocals), Don Henley (drums, vocals), Bernie Leadon (guitars, vocals) and Randy Meisner (bass guitar, vocals). With five number-one singles, six number-one albums, six Grammy Awards, and five American Music Awards, the Eagles were one of the most successful musical acts of the 1970s. Their albums Their Greatest Hits (1971–1975) and Hotel California rank first and third, respectively, among the best-selling albums in the United States, with 38 million and 26 million album units in sales.",
            "Guns N' Roses, often abbreviated as GNR, is an American hard rock band from Los Angeles, California, formed in 1985. When they signed to Geffen Records in 1986, the band comprised vocalist Axl Rose, lead guitarist Slash, rhythm guitarist Izzy Stradlin, bassist Duff McKagan, and drummer Steven Adler. The current lineup consists of Rose, Slash, McKagan, keyboardist Dizzy Reed, guitarist Richard Fortus, drummer Frank Ferrer and keyboardist Melissa Reese. Guns N' Roses' debut album, Appetite for Destruction (1987), reached number one on the Billboard 200 a year after its release.",
            "Nirvana was an American rock band formed in Aberdeen, Washington, in 1987. Founded by lead singer and guitarist Kurt Cobain and bassist Krist Novoselic, the band went through a succession of drummers before recruiting Dave Grohl in 1990. Though Nirvana dissolved in 1994 after the death of Cobain, their music maintains a popular following and continues to influence modern rock and roll culture. In the late 1980s, Nirvana established itself as part of the Seattle grunge scene, releasing its first album, Bleach, for the independent record label Sub Pop in 1989.",
            "Oasis were an English rock band formed in Manchester in 1991. Developed from an earlier group, the Rain, the band originally consisted of Liam Gallagher (lead vocals, tambourine), Paul Arthurs (guitar), Paul McGuigan (bass guitar), and Tony McCarroll (drums). Upon returning to Manchester, Liam's older brother, Noel Gallagher (lead guitar, vocals) joined as a fifth member, which formed the band's core and settled line-up. During the course of their existence, they had various line-up changes, though the Gallagher brothers remained as the staple members until the group's dissolution.",
            "Queen are a British rock band formed in London in 1970. Their classic line-up was Freddie Mercury (lead vocals, piano), Brian May (guitar, vocals), Roger Taylor (drums, vocals) and John Deacon (bass). Their earliest works were influenced by progressive rock, hard rock and heavy metal, but the band gradually ventured into more conventional and radio-friendly works by incorporating further styles, such as arena rock and pop rock. Before forming Queen, May and Taylor had played together in the band Smile. Mercury was a fan of Smile and encouraged them to experiment with more elaborate stage and recording techniques.",
            "The Rolling Stones are an English rock band formed in London in 1962. The first stable line-up consisted of bandleader Brian Jones (guitar, harmonica, keyboards), Mick Jagger (lead vocals, harmonica), Keith Richards (guitar, vocals), Bill Wyman (bass guitar), Charlie Watts (drums), and Ian Stewart (piano). Stewart was removed from the official line-up in 1963 but continued to work with the band as a contracted musician until his death in 1985. The band's primary songwriters, Jagger–Richards, assumed leadership after Andrew Loog Oldham became the group's manager.",
            "The Beatles were an English rock band formed in Liverpool in 1960. With a line-up comprising John Lennon, Paul McCartney, George Harrison and Ringo Starr, they are regarded as the most influential band of all time. The group were integral to the development of 1960s counterculture and popular music's recognition as an art form. Rooted in skiffle, beat and 1950s rock and roll, their sound incorporated elements of classical music and traditional pop in innovative ways; the band later explored music styles ranging from ballads and Indian music to psychedelia and hard rock. As pioneers in recording, songwriting and artistic presentation, the group revolutionised many aspects of the music industry and were often publicised as leaders of the era's youth and sociocultural movements."
    };

    private static int[] bandLogo = {
            R.drawable.logo_acdc,
            R.drawable.logo_aerosmith,
            R.drawable.logo_bonjovi,
            R.drawable.logo_eagles,
            R.drawable.logo_gun_and_roses,
            R.drawable.logo_nirvana,
            R.drawable.logo_oasis,
            R.drawable.logo_queen,
            R.drawable.logo_rollingstones,
            R.drawable.logo_thebeatles
    };

    private static int[] bandImages = {
            R.drawable.acdc,
            R.drawable.aerosmith,
            R.drawable.bonjovi,
            R.drawable.eagles,
            R.drawable.gun_and_roses,
            R.drawable.nirvana,
            R.drawable.oasis,
            R.drawable.queen,
            R.drawable.rolling_stones,
            R.drawable.the_beatles
    };

    static ArrayList<Band> getListData(){
        ArrayList<Band> list = new ArrayList<>();
        for (int position = 0; position < bandNames.length; position++) {
            Band band = new Band();
            band.setName(bandNames[position]);
            band.setGenre(bandGenre[position]);
            band.setYearsActive(bandYearsActive[position]);
            band.setMember(bandMember[position]);
            band.setInformation(bandInformation[position]);
            band.setLogo(bandLogo[position]);
            band.setPhoto(bandImages[position]);
            list.add(band);
        }
        return list;
    }
}

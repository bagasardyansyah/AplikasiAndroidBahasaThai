package com.example.myprojek;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class QuestionsBank {

    private static List<QuestionsList> konsonanQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
//        Create object
        questionsLists.add(new QuestionsList("ค", "kho khwaai", "kho khon", "do dek", "ko kai", "kho khwaai", ""));
        //Kerbau
        questionsLists.add(new QuestionsList("ฅ", "kho khwaai", "kho khon", "do dek", "ko kai", "kho khon", ""));
        //Orang
        questionsLists.add(new QuestionsList("ฆ", "cho chaang", "so soo", "kho ra-khang", "no nuu", "kho ra-khang", ""));
        //Lonceng
        questionsLists.add(new QuestionsList("ง", "ro reuua", "wo waeen", "tho tha-haan", "ngo nguu", "ngo nguu", ""));
        //Ular
        questionsLists.add(new QuestionsList("ช", "so soo", "no nuu", "cho chaang", "yo yak", "cho chaang", ""));
        //Gajah
        questionsLists.add(new QuestionsList("ซ", "so soo", "no nuu", "cho chaang", "yo yak", "so soo", ""));
        //Rantai
        questionsLists.add(new QuestionsList("ฌ", "yo ying", "cho cheu", "tho monthoo", "tho tha-haan", "cho cheu", ""));
        //Pohon
        questionsLists.add(new QuestionsList("ญ", "yo ying", "cho cheu", "tho monthoo", "tho tha-haan", "yo ying", ""));
        //Wanita
        questionsLists.add(new QuestionsList("ฑ", "yo ying", "cho cheu", "tho monthoo", "tho tha-haan", "tho monthoo", ""));
        //Mandodari
        questionsLists.add(new QuestionsList("ฒ", "tho monthoo", "tho phuu-thao", "tho tha-haan", "tho thong", "tho phuu-thao", ""));
        //Pria Tua
        questionsLists.add(new QuestionsList("ณ", "no neen", "pho samphao", "no nuu", "pho phaan", "no neen", ""));
        //Biksu muda
        questionsLists.add(new QuestionsList("ท", "tho monthoo", "tho phuu-thao", "tho tha-haan", "tho thong", "tho tha-haan", ""));
        //Tentara
        questionsLists.add(new QuestionsList("ธ", "tho monthoo", "tho phuu-thao", "tho tha-haan", "tho thong", "tho thong", ""));
        //Bendera
        questionsLists.add(new QuestionsList("น", "no neen", "pho samphao", "no nuu", "pho phaan", "no nuu", ""));
        //Tikus
        questionsLists.add(new QuestionsList("พ", "no neen", "pho samphao", "no nuu", "pho phaan", "pho phaan", ""));
        //Nampan
        questionsLists.add(new QuestionsList("ฟ", "fo fan", "pho phaan", "lo cu-laa", "pho pheung", "fo fan", ""));
        //Gigi
        questionsLists.add(new QuestionsList("ภ", "po plaa", "pho samphao", "pho pheung", "pho phaan", "pho samphao", ""));
        //Kapal Layar
        questionsLists.add(new QuestionsList("ม", "no nuu", "yo yak", "mo maa", "so soo", "mo maa", ""));
        //Kuda
        questionsLists.add(new QuestionsList("ย", "no nuu", "yo yak", "mo maa", "so soo", "yo yak", ""));
        //Raksasa
        questionsLists.add(new QuestionsList("ร", "wo waeen", "ngo nguu", "mo maa", "ro reuua", "ro reuua", ""));
        //Perahu
        questionsLists.add(new QuestionsList("ล", "o aang", "lo ling", "so seuua", "cho ching", "lo ling", ""));
        //Monyet
        questionsLists.add(new QuestionsList("ว", "wo waeen", "ngo nguu", "mo maa", "ro reuua", "wo waeen", ""));
        //Cincin
        questionsLists.add(new QuestionsList("ฬ", "fo fan", "pho phaan", "lo cu-laa", "pho pheung", "lo cu-laa", ""));
        //Layangan
        questionsLists.add(new QuestionsList("ฮ", "ho nok-huuk", "tho thaan", "tho thung", "kho khuat", "ho nok-huuk", ""));
        //Burung Hantu
        questionsLists.add(new QuestionsList("ก", "co caan", "ko kai", "do cha-daa", "to pa-tak", "ko kai", ""));
        //Ayam
        questionsLists.add(new QuestionsList("จ", "co caan", "ko kai", "do cha-daa", "to pa-tak", "co caan", ""));
        //Piring
        questionsLists.add(new QuestionsList("ฎ", "co caan", "ko kai", "do cha-daa", "to pa-tak", "do cha-daa", ""));
        //Mahkora
        questionsLists.add(new QuestionsList("ฏ", "co caan", "ko kai", "do cha-daa", "to pa-tak", "to pa-tak", ""));
        //Tombak
        questionsLists.add(new QuestionsList("ด", "do dek", "kho khwaai", "kho khon", "to tao", "do dek", ""));
        //Anak
        questionsLists.add(new QuestionsList("ต", "do dek", "kho khwaai", "kho khon", "to tao", "to tao", ""));
        //Kura kura
        questionsLists.add(new QuestionsList("บ", "po plaa", "mo maa", "bo bai-mai", "yo yak", "bo bai-mai", ""));
        //Daun
        questionsLists.add(new QuestionsList("ป", "po plaa", "mo maa", "bo bai-mai", "yo yak", "po plaa", ""));
        //Ikan
        questionsLists.add(new QuestionsList("อ", "o aang", "co caan", "lo ling", "cho ching", "o aang", ""));
        //Bak
        questionsLists.add(new QuestionsList("ข", "kho khuat", "mo maa", "kho khai", "no nuu", "kho khai", ""));
        //Telur
        questionsLists.add(new QuestionsList("ฃ", "kho khuat", "mo maa", "kho khai", "no nuu", "kho khuat", ""));
        //Botol
        questionsLists.add(new QuestionsList("ฉ", "o aang", "co caan", "lo ling", "cho ching", "cho ching", ""));
        //Simbal kecil
        questionsLists.add(new QuestionsList("ฐ", "tho tha-haan", "tho phuu-thao", "tho thung", "tho thaan", "tho thaan", ""));
        //Dudukan
        questionsLists.add(new QuestionsList("ถ", "tho tha-haan", "tho phuu-thao", "tho thung", "tho thaan", "tho thung", ""));
        //Tas
        questionsLists.add(new QuestionsList("ผ", "pho pheung", "pho phaan", "fo faa", "fo fan", "pho pheung", ""));
        //Lebah
        questionsLists.add(new QuestionsList("ฝ", "pho pheung", "pho phaan", "fo faa", "fo fan", "fo faa", ""));
        //Penutup
        questionsLists.add(new QuestionsList("ศ", "so saa-laa", "ko kai", "do dek", "ต เต่า", "so saa-laa", ""));
        //Paviliun
        questionsLists.add(new QuestionsList("ษ", "so saa-laa", "so reuu sii", "so soo", "cho chaang", "so reuu sii", ""));
        //Pertapa
        questionsLists.add(new QuestionsList("ส", "so reuu sii", "so seuua", "so saa-laa", "ho hiip", "so seuua", ""));
        questionsLists.add(new QuestionsList("ห", "so reuu sii", "so seuua", "so saa-laa", "ho hiip", "ho hiip", ""));
//
        Collections.shuffle(questionsLists);
        return questionsLists;
    }

    private static List<QuestionsList> kosakataQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
//        Create object
        questionsLists.add(new QuestionsList("อรุณสวัสดิ์", "arun sawat", "thiwaa sawat", "saayan sawat", "raatrii sawat", "arun sawat", ""));
        //Selamat Pagi
        questionsLists.add(new QuestionsList("ทิวาสวัสดิ์", "arun sawat", "thiwaa sawat", "saayan sawat", "raatrii sawat", "thiwaa sawat", ""));
        //Selamat Siang
        questionsLists.add(new QuestionsList("สายันสวัสดิ์", "arun sawat", "thiwaa sawat", "saayan sawat", "raatrii sawat", "saayan sawat", ""));
        //Selamat sore
        questionsLists.add(new QuestionsList("ราตรีสวัสดิ์", "arun sawat", "thiwaa sawat", "saayan sawat", "raatrii sawat", "raatrii sawat", ""));
        //Selamat Malam
        questionsLists.add(new QuestionsList("สวัสดี", "yindii", "sawatdii", "khoop kun", "khoo thoot", "sawatdii", ""));
        //Halo
        questionsLists.add(new QuestionsList("ขอบคุณ", "yindii", "sawatdii", "khoop kun", "khoo thoot", "khoop kun", ""));
        //Terima Kasih
        questionsLists.add(new QuestionsList("ยินดี", "yindii", "sawatdii", "khoop kun", "khoo thoot", "yindii", ""));
        //Dengan Senang Hati
        questionsLists.add(new QuestionsList("ขอโทษ", "yindii", "sawatdii", "khoop kun", "khoo thoot", "khoo thoot", ""));
        //Maaf
        questionsLists.add(new QuestionsList("ไม่เป็นรัย", "mai pen rai", "sawatdii", "khoop kun", "khoo thoot", "mai pen rai", ""));
        //Tidak apa apa
        questionsLists.add(new QuestionsList("สบายดีไหม", "sabaay dii mai", "mai pen rai", "khoop kun", "khoo thoot", "sabaay dii mai", ""));
        //Apa Kabar
        questionsLists.add(new QuestionsList("สบายดี", "mai pen rai", "sabaay di", "sabaay dii mai", "mai sabaay", "sabaay di", ""));
        //Sehat
        questionsLists.add(new QuestionsList("ม่สบาย", "mai pen rai", "sabaay di", "sabaay dii mai", "sabaay di", "mai sabaay", ""));
        //Sakit
        questionsLists.add(new QuestionsList("ใช่", "sabaay di", "mai chai", "chai", "mai", "chai", ""));
        //Iya
        questionsLists.add(new QuestionsList("ไม่", "sabaay di", "mai chai", "chai", "mai", "mai", ""));
        //Tidak
        questionsLists.add(new QuestionsList("ไม่ใช้", "sabaay di", "mai chai", "chai", "mai", "mai chai", ""));
        //Bukan
        questionsLists.add(new QuestionsList("ไหม่", "Mai", "mai chai", "chai", "khao cai", "Mai", ""));
        //Kah?
        questionsLists.add(new QuestionsList("เข้าใจ", "khao cai mai", "mai khao cai", "chai", "khao cai", "khao cai", ""));
        //Paham
        questionsLists.add(new QuestionsList("เข้าใจไหม่", "khao cai mai", "mai khao cai", "chai", "khao cai", "khao cai mai", ""));
        //Paham ga?
        questionsLists.add(new QuestionsList("ไม่เข้าใจ", "khao cai mai", "mai khao cai", "chai", "khao cai", "mai khao cai", ""));
        //Gapaham
        questionsLists.add(new QuestionsList("ได้", "dai mai", "dai", "mai dai", "chai", "dai", ""));
        //Bisa
        questionsLists.add(new QuestionsList("ได้ไหม่", "dai mai", "dai", "mai dai", "chai", "dai mai", ""));
        //Bisa ga?
        questionsLists.add(new QuestionsList("ไม่ได้", "dai mai", "dai", "mai dai", "chai", "mai dai", ""));
        //Tidak Bisa
        questionsLists.add(new QuestionsList("โอเค้", "oo khee", "mai oo khee", "oo khee mai", "mai dai", "oo khee", ""));
        //Oke
        questionsLists.add(new QuestionsList("โอเค้ไหม่", "oo khee", "mai oo khee", "oo khee mai", "mai dai", "oo khee mai", ""));
        //Oke Ga?
        questionsLists.add(new QuestionsList("ไม่โอเค้", "oo khee", "mai oo khee", "oo khee mai", "mai dai", "mai oo khee", ""));
        //Tidak Oke
        questionsLists.add(new QuestionsList("เจอกัน", "oo khee", "mai oo khee", "oo khee mai", "ceuu kan", "ceuu kan", ""));
        //Sampai Jumpa

        Collections.shuffle(questionsLists);
        return questionsLists;
    }

    private static List<QuestionsList> angkaQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
//        Create object
        questionsLists.add(new QuestionsList("๑ (หนึ่ง)", "neung", "soong", "saam", "sii", "neung", ""));
        questionsLists.add(new QuestionsList("๒ (สอง)", "neung", "soong", "saam", "sii", "soong", ""));
        questionsLists.add(new QuestionsList("๓ (สาม)", "neung", "soong", "saam", "sii", "saam", ""));
        questionsLists.add(new QuestionsList("๔ (สี่)", "neung", "soong", "saam", "sii", "sii", ""));
        questionsLists.add(new QuestionsList("๕ (ห้า)", "sii", "haa", "jet", "paet", "haa", ""));
        questionsLists.add(new QuestionsList("๖ (หก)", "hok", "haa", "jet", "paet", "hok", ""));
        questionsLists.add(new QuestionsList("๗ (เจ็ด)", "hok", "haa", "jet", "paet", "jet", ""));
        questionsLists.add(new QuestionsList("๘ (แปด)", "hok", "haa", "jet", "paet", "paet", ""));
        questionsLists.add(new QuestionsList("๙ (เก้า)", "kao", "haa", "jet", "paet", "kao", ""));
        questionsLists.add(new QuestionsList("๑๐ (สิบ)", "sip", "yii sip", "sii sip", "haa sip", "sip", ""));
        questionsLists.add(new QuestionsList("๑๑ (สิบเอ็ด)", "sip et", "sip soong", "sip saam", "sip sii", "sip et", ""));
        questionsLists.add(new QuestionsList("๑๒ (สิบสอง)", "sip et", "sip soong", "sip saam", "sip sii", "sip soong", ""));
        questionsLists.add(new QuestionsList("๑๓ (สิบสาม)", "sip et", "sip soong", "sip saam", "sip sii", "sip saam", ""));
        questionsLists.add(new QuestionsList("๑๔ (สิบสี่)", "sip et", "sip soong", "sip saam", "sip sii", "sip sii", ""));
        questionsLists.add(new QuestionsList("๑๕ (สิบห้า)", "sip et", "sip haa", "sip saam", "sip sii", "sip haa", ""));
        questionsLists.add(new QuestionsList("๑๖ (สิบหก)", "sip hok", "sip haa", "sip saam", "sip sii", "sip hok", ""));
        questionsLists.add(new QuestionsList("๑๗ (สิบเจ็ด)", "sip hok", "sip haa", "sip jet", "sip sii", "sip jet", ""));
        questionsLists.add(new QuestionsList("๑๘ (สิบแปด)", "sip hok", "sip haa", "sip jet", "sip paet", "sip paet", ""));
        questionsLists.add(new QuestionsList("๑๙ (สิบเก้า)", "sip kao", "sip haa", "sip jet", "sip paet", "sìp kao", ""));
        questionsLists.add(new QuestionsList("๒๐ (ยี่สิบ)", "sip", "yii sip", "sii sip", "haa sip","yii sip", ""));
        questionsLists.add(new QuestionsList("๒๑ (ยี่สิบเอ็ด)", "yii sip et", "yii sip", "yii sip soong", "yii sip saam","yii sip et",  ""));
        questionsLists.add(new QuestionsList("๒๒ (ยี่สิบสอง)", "yii sip et", "yii sip", "yii sip soong", "yii sip saam", "yii sip soong", ""));
        questionsLists.add(new QuestionsList("๒๓ (ยี่สิบสาม)", "yii sip et", "yii sip", "yii sip soong", "yii sip saam", "yii sip saam", ""));
        questionsLists.add(new QuestionsList("๓๐ (สามสิบ)", "saam sip", "yii sip", "sii sip", "haa sip", "saam sip", ""));
        questionsLists.add(new QuestionsList("๔๐ (สี่สิบ)", "sip", "yii sip", "haa sip", "sii sip", "sii sip", ""));
        questionsLists.add(new QuestionsList("๕๐ (ห้าสิบ)", "sip", "yii sip", "sii sip", "haa sip", "haa sip", ""));
        questionsLists.add(new QuestionsList("๖๐ (หกสิบ)", "hok sip", "yii sip", "haa sip", "sii sip", "hok sip", ""));
        questionsLists.add(new QuestionsList("๗๐ (เจ็ดสิบ)", "hok sip", "jet sip", "haa sip", "sii sip", "jet sip", ""));
        questionsLists.add(new QuestionsList("๘๐ (แปดสิบ)", "hok sip", "jet sip", "paet sip", "sii sip", "paet sip", ""));
        questionsLists.add(new QuestionsList("๙๐ (เก้าสิบ)", "kao sip", "jet sip", "sii sip", "haa sip", "kao sip", ""));
        questionsLists.add(new QuestionsList("๑๐๐ (หนึ่งร้อย)", "neung roi", "neung pun", "Neung meuhn", "neung saen", "neung roi", ""));
        questionsLists.add(new QuestionsList("๑๐๐๐ (หนึ่งพัน)", "neung roi", "neung pun", "Neung meuhn", "neung saen", "neung pun", ""));
        questionsLists.add(new QuestionsList("๑๐๐๐๐ (หนึ่งหมื่น)", "neung roi", "neung pun", "neung meuhn", "neung saen", "neung meuhn", ""));
        questionsLists.add(new QuestionsList("๑๐๐๐๐๐ (หนึ่งแสน)", "neung saen", "neung pun", "neung meuhn", "neung saen", "neung saen", ""));
        questionsLists.add(new QuestionsList("๑๐๐๐๐๐๐ (หนึ่งล้าน)", "neung saen", "neung laan", "neung meuhn", "neung saen", "neung laan", ""));

        Collections.shuffle(questionsLists);
        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "KONSONAN":
                return konsonanQuestions();
            case "KOSAKATA":
                return kosakataQuestions();
            case "ANGKA":
                return angkaQuestions();
            default:
                return angkaQuestions();
        }
    }
}

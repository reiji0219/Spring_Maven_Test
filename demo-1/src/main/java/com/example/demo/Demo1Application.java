package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		
			System.out.println( "終わりだよー" );
	}
/*
 	コマンドプロンプトで下記を打ち込むと「8080」の通信状態が分かる。-ano を -? でヘルプ
 		-anoは a, n, o の複合技。数字を換えれば色々確認出来る
 		
C:\Users\reiji>netstat -ano | find ":8080"			//何も出なければ何処にも接続なし



	// Webページで[white Label page]( 404 )が表示される。ヤバいパターン
	 		リクエストしているのにレスポンスがない状態
	 		
C:\Users\reiji>netstat -ano | find ":8080"
  TCP         0.0.0.0:8080           0.0.0.0:0              LISTENING       3476
  TCP         [::]:8080             	 [::]:0                 	LISTENING       3476



	// 通信が確立出来た時、成功した時に出る。リクエストとレスポンスに数値が出る
	 * 
C:\Users\reiji>netstat -ano | find ":8080"
  TCP         0.0.0.0:8080           0.0.0.0:0              LISTENING       3476
  TCP         [::]:8080              	 [::]:0                 	LISTENING       3476
  TCP         [::1]:54935            [::1]:8080             TIME_WAIT       0
  TCP         [::1]:54936            [::1]:8080             TIME_WAIT       0


	対処方法 :偶然直った。多分ネットワーク関連だと思われる。左下の検索で「ネットワーク」と
		打ち、「ネットワークの状態」をクリック、下の方に「ネットワークと共有センター」を
		クリック、現在使用中の通信をクリック、プロパティを選択、「IPv4」をダブルクリック、
		下に有る、DNSサーバーを一度「自動」にして適応。一度ソースを動かして成功すればOK
		「8.8.8.8」と「8.8.4.4」が消えるので再度打ち込む。再度テストしてOKならそのまま
		 適応する。
*/
}

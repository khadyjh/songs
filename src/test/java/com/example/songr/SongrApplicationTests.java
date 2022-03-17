package com.example.songr;

import com.example.songr.domain.Album;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("test constructor")
	void album(){
		Album album=new Album("title","hamzah namira",5,"www.newone.com",120.5f);
		String exp="Album{title='title', artist='hamzah namira', songCount=5, imgUrl='www.newone.com', length=120.5}";

		assertEquals(exp,album.toString());
	}

	@Test
	@DisplayName("test get")
	void getAlbum(){
		Album album=new Album("title","hamzah namira",5,"www.newone.com",120.5f);

		String exp="hamzah namira";

		assertEquals(exp,album.getArtist());
	}

	@Test
	@DisplayName("test set")
	void setAlbum(){
		Album album=new Album("title","hamzah namira",5,"www.newone.com",120.5f);

		album.setSongCount(12);
		int exp=12;

		assertEquals(exp,album.getSongCount());
	}

}

package com.human.springboot;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface empDAO {
	ArrayList<EmpDTO> list();   // 반환값 메소드명(매개변수들)
	ArrayList<RoomtypeDTO> listRoomType();
	void insertRoomType(String typename);
	void deleteRoomType(int typenum);
	void updateRoomType(String tname, int tnum);
	ArrayList<RoomInfoDTO> listRoomInfo();
	void deleteRoomInfo(int room_num);
	void insertRoomInfo(String one, int two, int three, int four);
	void updateRoomInfo(int first, String second, int third, int fourth, int fifth);
	int getMemberCount(String loginid, String passcode);
}

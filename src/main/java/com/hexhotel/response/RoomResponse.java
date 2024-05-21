package com.hexhotel.response;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;

import com.hexhotel.model.BookedRoom;

import jakarta.persistence.Lob;

public class RoomResponse {
	
	 private  Long id;
	    private String roomType;
	    private BigDecimal roomPrice;
	    private boolean isBooked = false;
	    @Lob
	    private String photo;
	    private List<BookedRoom> bookings;
	    
	    
		public RoomResponse(Long id, String roomType, BigDecimal roomPrice) {
			
			this.id = id;
			this.roomType = roomType;
			this.roomPrice = roomPrice;
		}


		public RoomResponse(Long id, String roomType, BigDecimal roomPrice, boolean isBooked, byte[] photoBytes,
				List<BookedRoom> bookings) {
			super();
			this.id = id;
			this.roomType = roomType;
			this.roomPrice = roomPrice;
			this.isBooked = isBooked;
			this.photo = photoBytes != null ? Base64.encodeBase64String(photoBytes) : null;
			this.bookings = bookings;
		}
	    
	    
}

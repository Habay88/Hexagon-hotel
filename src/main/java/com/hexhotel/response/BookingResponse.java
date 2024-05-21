package com.hexhotel.response;

import java.time.LocalDate;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingResponse {

	 private  Long bookingId;

	  
	    private LocalDate checkInDate;

	  
	    private LocalDate checkOutDate;

	    
	    private String guestFullName; 

	  
	    private String guestEmail;

	
	    private int NumOfAdults;

	  
	    private int NumOfChildren;

	   
	    private int totalNumOfGuest;

	    private String bookingConfirmationCode;

		public BookingResponse(Long bookingId, LocalDate checkInDate, LocalDate checkOutDate,
				String bookingConfirmationCode) {
			super();
			this.bookingId = bookingId;
			this.checkInDate = checkInDate;
			this.checkOutDate = checkOutDate;
			this.bookingConfirmationCode = bookingConfirmationCode;
		}
	    
}

package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="JODA_POLITICIAN")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Politiician {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "PID_SEQ1",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy= GenerationType.AUTO)
	private  Integer pid;
	@NonNull
	@Column(length = 30)
	private  String pname;

	@Column(length = 30)
	@NonNull
	private   String paddrs;
	@NonNull
	private   LocalDate  dob;
	@NonNull
	private   LocalTime tob;
	@NonNull
	private  LocalDateTime  doj;

}

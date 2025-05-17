package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JPA_LOB_JOBSEEKER")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class JobSeeker {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "JSID_SEQ",allocationSize = 1,initialValue = 100)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private   Integer jsid;
	@NonNull
	@Column(length = 30)
	private   String jsname;
	@NonNull
	@Column(length = 30)
	private    String jsaddrs;
	@NonNull
	private   boolean  married;
	@Lob
	@NonNull
	@Column(length = 2000)
	private  byte[]   photo;
	@Lob
	@NonNull
	@Column(length = 2000)
	private   char[]  resume;
}

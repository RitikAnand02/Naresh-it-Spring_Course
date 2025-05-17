package com.nt.service;

import com.nt.entity.Politiician;

public interface IPoliticianMgmtService {
   public  String   registerPolitician(Politiician politician);
   public   Iterable<Politiician>  showAllPoliticians();
   public   float  showPoliticialAgeById(int id);
   
}

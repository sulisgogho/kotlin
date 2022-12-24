fun main() {
   var nama = "Sulis"
   val strata = 2
   val jurnalpengabdiannasional = 9
   val jurnalpengabdianinternasional = 5
   val jurnalpenelitiannasional =8
   val jurnalpenelitiananinternasional = 10
   val sertifikatnasional = 15
   val sertifikatinternasional = 12
   val skmengajar = 5
   val tandatangansenat = 5
    
   
   val poin_ijazah = 20
   val poin_jurnalnasional = 5
   val poin_jurnalinternasional = 10
   val poin_penulis1 = 30
   val poin_penulis23 = 10
   val poin_sertifikatnasional = 10
   val poin_sertifikatinternasional = 40
   val poin_skmengajar =30 
   val poin_tandatangansenat = 10
    
   val total_ijazah = strata * poin_ijazah
   val total_jurnalpengabdian = jurnalpengabdiannasional*poin_jurnalnasional+jurnalpengabdianinternasional*poin_jurnalinternasional
   val total_jurnalpenelitian = (jurnalpenelitiannasional*poin_jurnalnasional+jurnalpenelitiannasional*poin_penulis1)+(jurnalpenelitiananinternasional*poin_jurnalinternasional+jurnalpenelitiananinternasional+poin_penulis23)
   val total_sertifikat = (sertifikatnasional*poin_sertifikatnasional+sertifikatinternasional*poin_sertifikatinternasional)
   val total_skmengajar = (skmengajar*poin_skmengajar)
   val total_tandatangansenat = tandatangansenat*poin_tandatangansenat
    
   val total_keseluruhan =total_ijazah+total_jurnalpengabdian+total_jurnalpenelitian+total_sertifikat+total_skmengajar+total_tandatangansenat
   
   if  ( strata == 3 && total_keseluruhan  >= 800 ) {
      println("Nama			: "+nama)
      println("Total Ijazah		: "+total_ijazah)
      println("Total Jurnal Pengabdian	: "+total_jurnalpengabdian)
      println("Total Jurnal Penelitian	: "+total_jurnalpenelitian)
      println("Total Sertifikat	: "+total_sertifikat)
      println("Total SK Mengajar	: "+total_skmengajar)
      println("Total Tanda Tangan	: "+total_tandatangansenat)
      println("Total Nilai 		: "+total_keseluruhan)
      println("Jabatan 		: Profesor")
   } else if (strata == 3 && total_keseluruhan >= 400){
      println("Nama			: "+nama)
      println("Total Ijazah		: "+total_ijazah)
      println("Total Jurnal Pengabdian	: "+total_jurnalpengabdian)
      println("Total Jurnal Penelitian	: "+total_jurnalpenelitian)
      println("Total Sertifikat	: "+total_sertifikat)
      println("Total SK Mengajar	: "+total_skmengajar)
      println("Total Tanda Tangan	: "+total_tandatangansenat)
      println("Total Nilai 		: "+total_keseluruhan)
      println("Jabatan 		: Lektor Kepala")
   } else if (strata == 3 && total_keseluruhan >= 200){
      println("Nama			: "+nama)
      println("Total Ijazah		: "+total_ijazah)
      println("Total Jurnal Pengabdian	: "+total_jurnalpengabdian)
      println("Total Jurnal Penelitian	: "+total_jurnalpenelitian)
      println("Total Sertifikat	: "+total_sertifikat)
      println("Total SK Mengajar	: "+total_skmengajar)
      println("Total Tanda Tangan	: "+total_tandatangansenat)
      println("Total Nilai 		: "+total_keseluruhan)
      println("Jabatan 		: Lektor")
   } else {
     println("Nama			: "+nama)
      println("Total Ijazah		: "+total_ijazah)
      println("Total Jurnal Pengabdian	: "+total_jurnalpengabdian)
      println("Total Jurnal Penelitian	: "+total_jurnalpenelitian)
      println("Total Sertifikat	: "+total_sertifikat)
      println("Total SK Mengajar	: "+total_skmengajar)
      println("Total Tanda Tangan	: "+total_tandatangansenat)
      println("Total Nilai 		: "+total_keseluruhan)
      println("Jabatan 		: Asisten Ahli")
   }
   
}

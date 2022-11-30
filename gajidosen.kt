fun main() {
   val nama = "Adi"
   val sksadi = 6
   val skswajib = 6
   val skslebih = sksadi-skswajib 
   val bimbingan= 5
   
 	   val gajilebih = skslebih * 28000
       val gajipertemuan = skslebih * 4 * 16000
       val gajibimbingan = bimbingan * 5000
       val infaq = 0.05 * (gajilebih +gajipertemuan +gajibimbingan)
       val totalgaji = (gajilebih+gajipertemuan+gajibimbingan)-infaq
       
       println("Nama		: "+nama)
       println("Banyak SKS	: "+sksadi)
       println("Gaji Lebih SKS	: "+gajilebih)
       println("Gaji Pertemuan	: "+gajipertemuan)
       println("Gaji Bimbingan	: "+gajibimbingan)
       println("Infaq		: "+infaq)
       println("Total Gaji	: "+totalgaji)
    
}

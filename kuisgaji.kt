
fun main() {
   var nama = "Nawwir"
   val golongan = 1
   val jamkerja = 173
   val jamnormal = 173
   val lembur = 20000*(jamkerja-jamnormal)
   
   if (golongan == 4){
       val gp = 2899500
       val tp = 400000
       val gaji = (gp+tp)
       
       if(jamkerja>jamnormal){
       val pajak = (gaji+lembur)*0.005
       val totalgaji = gaji+lembur-pajak 
         
       println("Nama		: "+nama)
       println("Golongan	: "+golongan)
       println("Jam Kerja	: "+jamkerja)
       println("Gaji Pokok	: "+gp)
       println("Tunjangan	: "+tp)
       println("Gaji Lembur	: "+lembur)
       println("Gaji Kotor	: "+(gaji+lembur))
       println("Pajak 0.5%	: "+pajak)
       println("Gaji Bersih	: "+totalgaji)
       
       } else {
       val pajak = gaji * 0.005
       val totalgaji = gaji-pajak
           
       println("Nama		: "+nama)
       println("Golongan	: "+golongan)
       println("Jam Kerja	: "+jamkerja)
       println("Gaji Pokok	: "+gp)
       println("Tunjangan	: "+tp)
       println("Gaji Lembur	: Tidak ada Lembur")
       println("Gaji Kotor	: "+gaji)
       println("Pajak 0.5%	: "+pajak)
       println("Gaji Bersih	: "+totalgaji)
       }
   } else if (golongan == 3){
       val gp = 2456700
       val tp = 350000
       val gaji = (gp+tp)
       
       if(jamkerja>jamnormal){
       val pajak = (gaji+lembur)*0.005
       val totalgaji = gaji+lembur-pajak 
         
       println("Nama		: "+nama)
       println("Golongan	: "+golongan)
       println("Jam Kerja	: "+jamkerja)
       println("Gaji Pokok	: "+gp)
       println("Tunjangan	: "+tp)
       println("Gaji Lembur	: "+lembur)
       println("Gaji Kotor	: "+(gaji+lembur))
       println("Pajak 0.5%	: "+pajak)
       println("Gaji Bersih	: "+totalgaji)
       
       } else {
       val pajak = gaji * 0.005
       val totalgaji = gaji-pajak
           
       println("Nama		: "+nama)
       println("Golongan	: "+golongan)
       println("Jam Kerja	: "+jamkerja)
       println("Gaji Pokok	: "+gp)
       println("Tunjangan	: "+tp)
       println("Gaji Lembur	: Tidak ada Lembur")
       println("Gaji Kotor	: "+gaji)
       println("Pajak 0.5%	: "+pajak)
       println("Gaji Bersih	: "+totalgaji)
       }
   } else if(golongan == 2){
       val gp = 1926000
       val tp = 300000
       val gaji = (gp+tp)
       
       if(jamkerja>jamnormal){
       val pajak = (gaji+lembur)*0.005
       val totalgaji = gaji+lembur-pajak 
         
       println("Nama		: "+nama)
       println("Golongan	: "+golongan)
       println("Jam Kerja	: "+jamkerja)
       println("Gaji Pokok	: "+gp)
       println("Tunjangan	: "+tp)
       println("Gaji Lembur	: "+lembur)
       println("Gaji Kotor	: "+(gaji+lembur))
       println("Pajak 0.5%	: "+pajak)
       println("Gaji Bersih	: "+totalgaji)
       
       } else {
       val pajak = gaji * 0.005
       val totalgaji = gaji-pajak
           
       println("Nama		: "+nama)
       println("Golongan	: "+golongan)
       println("Jam Kerja	: "+jamkerja)
       println("Gaji Pokok	: "+gp)
       println("Tunjangan	: "+tp)
       println("Gaji Lembur	: Tidak ada Lembur")
       println("Gaji Kotor	: "+gaji)
       println("Pajak 0.5%	: "+pajak)
       println("Gaji Bersih	: "+totalgaji)
       }
   } else if(golongan == 1){
       val gp = 1486500
       val tp = 250000
       val gaji = (gp+tp)
       
       if(jamkerja>jamnormal){
       val pajak = (gaji+lembur)*0.005
       val totalgaji = gaji+lembur-pajak 
         
       println("Nama		: "+nama)
       println("Golongan	: "+golongan)
       println("Jam Kerja	: "+jamkerja)
       println("Gaji Pokok	: "+gp)
       println("Tunjangan	: "+tp)
       println("Gaji Lembur	: "+lembur)
       println("Gaji Kotor	: "+(gaji+lembur))
       println("Pajak 0.5%	: "+pajak)
       println("Gaji Bersih	: "+totalgaji)
       
       } else {
       val pajak = gaji * 0.005
       val totalgaji = gaji-pajak
           
       println("Nama		: "+nama)
       println("Golongan	: "+golongan)
       println("Jam Kerja	: "+jamkerja)
       println("Gaji Pokok	: "+gp)
       println("Tunjangan	: "+tp)
       println("Gaji Lembur	: Tidak ada Lembur")
       println("Gaji Kotor	: "+gaji)
       println("Pajak 0.5%	: "+pajak)
       println("Gaji Bersih	: "+totalgaji)
       }
   }
}

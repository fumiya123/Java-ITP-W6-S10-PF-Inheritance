# Java-ITP-W6-S10-PF-Inheritance

Kelas Introduction to Programming / Week 6 / Session 10

### Penjelasan:
- Pertama kita definisikan kelas `Kendaraan` kelas ini akan menjadi Superclass, berisi variabel `merk` dan `pabrik`, konstruktor `Kendaraan` dan method `info()` yang menampilkan merk dan pabrik.
- Kedua kita definisikan kelas `MobilFortuner` yang akan menjadi Subclass dari `Kendaraaan` dengan menambah keyword `extends` sehingga kodenya seperti berikut `class MobilFortuner extends Kendaraan`.
- Dalam kelas `MobilFortuner` kita juga membuat construktor `MobilFortuner` yang juga memanggil constructor dari superclass menggunakan keyword `super` seperti berikut `super(merk, pabrik);`, construktor `MobilFortuner` mengembalikan variabel instance `namaMobil`.
- Kemudian buat juga method `infoMobil` yang akan menampilkan text "Mobil ini bernama TOYOTA FORTUNER".
- Terakhir buat kelas `Main` dan menampilkan `merk`, `pabrik` dan `namaMobil`.

Sekian.

Habib Azizul Haq  
(2702488253)

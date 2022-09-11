# Parcelable ve Serializable

Bu iki yöntem ile referans tipleri parçalayıp bir hizaya getiriyoruz daha sonrasında Intent yapısının içerisine koyup diğer bir activitiye taşıyoruz.

Bir class taşınmak istenirse bu class primitive tipe dönüştürülmesi gerekir. Bir classı o classdan oluşturulmuş nesnenin stringe 
çevrilmesine Serializable işlemi denir. Tam tersi duruma ise deSerializable denir. Yani String bir ifadenin tekrar nesneye dönüştürülmesi işlemidir.

Parcelable Android için Google mühendisleri tarafından sayfalar arası daha hızlı veri transferi yapabilmek için geliştirilmiştir. 
Parcelable interface performansıyla Serializable'a göre üstünlük sağlıyor. Google mühendislerine göre Parcelable hız 
konusunda oldukça iyi seviyede. Yani veri transferini hızlı bir şekilde gerçekleştirebiliyor.

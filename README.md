# Button Kontrol Paneli Uygulamas

Bu Java uygulaması, bir Swing penceresinde düzenlenmiş bir dizi özel JButton içeriyor. Her bir düğme tıklandığında arka plan rengini değiştiriyor ve en son tıklanan düğmenin referansını saklıyor.

İşlevsellik şu adımlarla tanımlanabilir:

* Pencere Oluşturma:
   - `JFrame` sınıfı kullanılarak bir pencere oluşturulur.
   - Pencerenin boyutu, başlığı ve diğer özellikleri ayarlanır.

* Özel Düğmeleri Eklemek:
   - `CustomButton` sınıfından özel düğmeler oluşturulur.
   - Düğmeler, belirli koordinatlar ve boyutlarla pencereye eklenir.
   - Her düğme, tıklama olaylarını dinlemek üzere `ActionListener` (bu durumda `Main` sınıfı) ile ilişkilendirilir.

* Tıklama Olayları:
   - `actionPerformed` metodu, düğmelere tıklandığında çağrılır.
   - Eğer önceki bir düğme tıklanmışsa, onun arka plan rengi orijinal rengine geri döndürülür.
   - Şu an tıklanan düğmenin arka plan rengi yeşil yapılır.
   - `lastClickedButton` değişkeni, en son tıklanan düğmenin referansını saklar.

* Uygulamayı Çalıştırma:
   - `main` metodu, uygulamayı başlatır. Yapmanız gereken tek şey bu sınıfı çalıştırmaktır (`java Main`).

* Test Etme:
   - Uygulamayı başlattıktan sonra, pencerede görünen düğmelere tıklayarak arka plan renklerinin değiştiğini gözlemleyebilirsiniz.

Bu uygulama, basit bir kullanıcı arayüzü (UI) örneği sunar ve kullanıcıya tıklamaların nasıl işlendiğini gösterir. Uygulamayı daha da geliştirmek istiyorsan, farklı olaylara tepki verecek özellikler ekleyebilir veya UI'ı daha karmaşık hale getirebilirsin.

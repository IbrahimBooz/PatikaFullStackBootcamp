# LIKE-ILIKE
#  country tablosunda bulunan country sütunundaki ülke isimlerinden 'A' karakteri ile başlayıp'a' karakteri ile sonlananları sıralayınız.

select * from country

where country like 'A%a';

# country tablosunda bulunan country sütunundaki ülke isimlerinden en az 6 karakterden oluşan ve sonu'n' karakteri ile sonlananları sıralayınız.

select * from country

where country like '_____n';

# film tablosunda bulunan title sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harffarketmesizin 'T' karakteri içeren film isimlerini sıralayınız.

SELECT title FROM film

WHERE title ILIKE '%t%t%t%t%';

# film tablosunda bulunan tüm sütunlardaki verilerden title 'C' karakteri ile başlayan ve uzunluğu(length) 90 dan büyük olan ve rental_rate 2.99 olan verileri sıralayınız.

select * from film

where title like 'C%' AND length BETWEEN 90 AND 120  AND rental_rate = 2.99;

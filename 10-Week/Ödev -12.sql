# film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?

SELECT length, ROUND((SELECT AVG(length) AS AVG FROM film),2)
FROM film
WHERE length > (
 ROUND((SELECT AVG(length) AS AVG FROM film),2)
);

# film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?

SELECT COUNT( rental_rate) AS film_count
FROM film
WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);

# film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.

SELECT rental_rate, replacement_cost, title
FROM film
WHERE rental_rate = (SELECT MIN(rental_rate) FROM film)
AND
replacement_cost = (SELECT MIN(replacement_cost) FROM film);

# payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

SELECT customer_id, COUNT(payment_id) AS total_purchases
FROM payment
GROUP BY customer_id
ORDER BY total_purchases DESC;


select category, sum(book_sales.sales) from
book left join book_sales on book.book_id = book_sales.book_id
where date_format(book_sales.sales_date,'%y%m') = '2201'
group by category
order by category
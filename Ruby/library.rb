actual = gets.strip.chomp.to_s.split(' ')
expected = gets.strip.chomp.to_s.split(' ')

actDate = actual[0].to_i
actMonth = actual[1].to_i
actYear = actual[2].to_i

expDate = expected[0].to_i
expMonth = expected[1].to_i
expYear = expected[2].to_i

fine = 0

if actYear != expYear
  fine = 10000
elsif actYear == expYear && actMonth > expMonth
  fine = (actMonth - expMonth) * 500
elsif actMonth == expMonth && actDate > expDate
  fine = (actDate - expDate) * 15
end

print fine










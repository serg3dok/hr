#!/bin/ruby

def test_case
  arrived = 0
  0.upto($n-1) do |i|
    if $a[i] < 1
      puts $a[i]
      arrived = arrived + 1
    end

  end

  puts "arrived: #{arrived}", arrived

  if arrived >= $k
    puts "arrived more than #{$k} or equal, no need to cancel"
    return true
  end
  puts "arrived less than #{$k}, need to cancel!"
  return false
end


  t = gets.strip.to_i  #testcases
  $yes_no = {}
  0.upto(t-1) do |i|
    n,k = gets.strip.split(' ')
    $n = n.to_i  #students
    puts "students: #{$n}"
    $k = k.to_i  #cancel
    puts "required students: #{$k}"
    a = gets.strip
    $a = a.split(' ').map(&:to_i) #arrivetime
    if test_case then
      $yes_no[i] = 'NO'
    else
      $yes_no[i] = 'YES'
    end
  end

0.upto(t-1) do |i|
  puts $yes_no[i]
end




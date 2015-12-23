input = gets.chomp
puts Calculate(input.to_i)

def Calculate(number)
  result = number * (calculate(number - 1))
  return result.to_s;
end
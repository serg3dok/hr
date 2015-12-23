def calculate_growth(n)
  h = 1;

  if n == 0
    return 1
  end

  i = 0
  while i < n
    h *= 2
    if n.odd? and i ==  n-1
      return h
    end
    h += 1
    i += 1
    if n.even? and i == n-1
      return h
    end
    i += 1
  end
end


t = gets.strip.to_i  # number of test cases
0.upto(t-1) do |i|
  n = gets.strip.to_i  # number of cycles
  puts calculate_growth(n)
end




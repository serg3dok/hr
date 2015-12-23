

def testCase

  arrived = 0
  0.upto($students) do |i|
    if $arrival[i].to_i < 1 then
      arrived += 1
    end
  end

  if arrived < $cancel
    return false
  else
    return true
  end

end


numberOfTestCases = gets.strip.to_i

  0.upto(numberOfTestCases) do |i|
    while i < numberOfTestCases do
      firstInput = gets.chomp.split(' ')
      $students = firstInput[0].to_i
      $cancel = firstInput[1].to_i
      $arrival = gets.chomp.split(' ').collect { |n| n = n.to_i }
      $arrYesNo = {}

      if testCase == true then
        $arrYesNo[i] = 'YES'
      else
        $arrYesNo[i] = 'NO'
      end

       i += 1
    end

    0.upto(numberOfTestCases) do |ti|
      puts $arrYesNo[ti]
    end
  end




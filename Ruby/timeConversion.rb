

input = gets.chomp
time12 = input.split(':')
daytime = /[ap]m/i.match(time12[2]).to_s
seconds = /\d\d?/.match(time12[2]).to_s
minutes = time12[1]
hours = time12[0]
if daytime.to_s.downcase == "pm" and hours.to_i != 12
  hours = hours.to_i + 12
elsif daytime.to_s.downcase == "am" and hours.to_i == 12
    hours = "00"
end
hours24 = "%02d:%02d:%02d" % [ hours.to_i, minutes.to_i, seconds.to_i ]
print hours24



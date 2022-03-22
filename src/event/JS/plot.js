const unakiAPI = require('unakiWrapper')
const option = [{
x: 9,
y: 6,
APIKEY: 243111322224643111,
Key: 3.0
}]
const unakiUser = unakiAPI.Login('unakiuser', option.APIKEY, option.Key)
unakiUser.Slot(option.x, option.y)
this.x = 9
this.y = 9
// 9x9
// slot X/Y Option Not change
// add unakiUser.SlotAdd(this.x, this.y)
unakiUser.SlotAdd(this.x, this.y)
unakiUser.SlotAdd(this.x, this.y)
unakiUser.LEnd()

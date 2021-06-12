# simpleblockchain
Simple mineable blockchain made from [this tutorial](https://medium.com/programmers-blockchain/create-simple-blockchain-java-tutorial-from-scratch-6eeed3cb03fa)


```
Trying to mine block 1...
Block Mined!!! :00000fcddd41e181623d4fb8c535ac05bf425ef5c0937a6332ac07c5b5a18414
Trying to mine block 2...
Block Mined!!! :00000255f00e11616bcd05b9ba183a34400f6998911f0a2049cd9a3a844e934d
Trying to mine block 3...
Block Mined!!! :00000002914534ffd10844a540a9be5e95ae9e57057bac560fd77115571b5e8f

Blockchain is Valid: true
The blockchain: 
[
  {
    "hash": "00000fcddd41e181623d4fb8c535ac05bf425ef5c0937a6332ac07c5b5a18414",
    "previousHash": "0",
    "data": "Hi im the first block",
    "timeStamp": 1623509612582,
    "nonce": 817559
  },
  {
    "hash": "00000255f00e11616bcd05b9ba183a34400f6998911f0a2049cd9a3a844e934d",
    "previousHash": "00000fcddd41e181623d4fb8c535ac05bf425ef5c0937a6332ac07c5b5a18414",
    "data": "Yo im the second block",
    "timeStamp": 1623509613818,
    "nonce": 1937188
  },
  {
    "hash": "00000002914534ffd10844a540a9be5e95ae9e57057bac560fd77115571b5e8f",
    "previousHash": "00000255f00e11616bcd05b9ba183a34400f6998911f0a2049cd9a3a844e934d",
    "data": "Hey im the third block",
    "timeStamp": 1623509616656,
    "nonce": 1506685
  }
]
```

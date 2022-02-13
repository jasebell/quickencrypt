# QuickEncrypt

A very quick and AES algorithm implementation in Clojure.

Just put it together and wrapped it up in a library to use as I was copy/pasting it too much.

## Usage
The library is available to use on [Clojars](https://clojars.org).

[![Clojars Project](https://img.shields.io/clojars/v/net.clojars.jasonbell/quickencrypt.svg)](https://clojars.org/net.clojars.jasonbell/quickencrypt)

### To Encrypt a String
The function takes in two arguments, the string you want to encrypt and a key.  You will require the key to decrypt the message, so please don't forget it.

```
user=> (require '[quickencrypt.core :as qe])
user=> (qe/encrypt "This is a test string." "mykey")
"epHabXjtJDuGia2x3yykFkzLP/ZylzWMnhMOz9Kbhwg="
```

### To Decrypt a String
To decrypt an encrypted message use the `decrypt` function with the encrypted string and the key that was used.


```
user=> (qe/decrypt "epHabXjtJDuGia2x3yykFkzLP/ZylzWMnhMOz9Kbhwg=" "mykey")
"This is a test string."
```

## References
A light bit of reading for those who wish to:
- [Is there an AES Library for Clojure? - Stackoverflow](https://stackoverflow.com/questions/10221257/is-there-an-aes-library-for-clojure)
- [Matthew Downey - Encrypting Keys In Clojure](https://matthewdowney.github.io/encrypting-keys-in-clojure-applications.html)
- [Angela Anbroz - Clojure Cryptography](https://www.angelaambroz.com/blog/posts/2017/Dec/29/clojure__cryptography__maximum_fun/)

## Licence
The code has been extensively blogged, referenced in articles. I claim no ownership of the code.

### MIT License
For this repository...

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

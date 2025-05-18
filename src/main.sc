require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start || sessionResult = "лох", sessionResultColor = "#FFFFFF"
        q!: $regex</start>
        a: Привет, пирожок!
        buttons:
            "Нажми сейчас"
        image: https://eu-prod-bs.s3.eu-central-1.amazonaws.com/eu-prod-bs/1007741/4043489/9bcwXLVgjAN3iYDy.png
        go!: /Пока

    state: Hello
        intent!: /hello
        a: Hello hello

    state: Bye
        intent!: /bye
        a: Bye bye

    state: NoMatch
        event!: noMatch
        a: I do not understand. You said: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}

    state: Пока
        a: Вот и закончился тест || htmlEnabled = true, html = "Вот и <b>закончился тест</b>"
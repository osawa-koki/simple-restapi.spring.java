# simple-restapi.spring.java

RESTfulAPIサーバデモ。  
🥺🥺🥺🥺🥺  

## 実行方法

普通にEclipseやIntelliJ IDEAで実行すればOK!  
<http://localhost:8080>へアクセス。  

Dockerで実行するなら以下の通り。  

```shell
docker build -t simple-restapi-spring-java .
docker run -p 80:8080 -it --rm --name my-simple-restapi-spring-java simple-restapi-spring-java

# 一行で書くなら
docker build -t simple-restapi-spring-java . && docker run -p 80:8080 -it --rm --name my-simple-restapi-spring-java simple-restapi-spring-java
```

## デプロイ設定(Render.com)

| キー | バリュー |
| ---- | ---- |
| Name | java-spring-inquiry |
| Region | Oregon(US West) |
| Branch | main |
| Root Directory |  |
| Environment | Docker |
| Dockerfile Path | ./Dockerfile |
| Docker Build Context Directory |  |
| Docker Command |  |

## HTTP動詞マッピングデモ

![HTTP動詞マッピングデモ](/dev/docs/img/simple-httpverb.gif)  

## パラメタの取得デモ

![パラメタの取得デモ](/dev/docs/img/simple-parameter_acquisition.gif)  

## JSONパースデモ

![JSONパースデモ](/dev/docs/img/simple-json-parse.gif)  

## 参考資料・お役立ちツールとか

### Postman

APIをテストとかするのに役立つ。  
<https://www.postman.com/>  

### spring.pleiades.io

公式ドキュメントっぽい。  
知らんけど、、、  
<https://spring.pleiades.io/guides/gs/rest-service/>  

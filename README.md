## 課題内容

①以下の記事を読了してください
- https://zenn.dev/currypun/articles/bf81c23161a378
- https://se-media.jp/java/1701/?utm_source=chatgpt.com
- https://qiita.com/rkonno/items/1b30daf83854fecbb814 

②各ファイルを以下の観点で修正してください。

- 変数名、メソッド名が役割を正しく表しているか検討し、適切な名前にリネームしてください。

- 巨大な1つのクラスから、役割（ロジック）ごとに新しいJavaクラスを切り出してください。

## 取り組み手順
①ブラウザで以下にアクセス：  
- https://github.com/prum-jp/academy-refactoring-base

②右上の「Use this template」ボタンをクリック

③任意リポジトリ名を入力して「Create repository」をクリック

④自分のリポジトリをクローン：  
- git clone https://github.com/【自分のユーザー名】/【リポジトリ名】.git

⑤mainブランチから作業ブランチをきる
```
git switch -c <ブランチ名>
```

⑥課題に取り組む

⑦変更をコミット＆プッシュ：  
- git add .  
- git commit -m "【任意の内容】"  
- git push origin <ブランチ名>

⑧mainブランチ向けのPull Request（PR）を作成する

## Pull Request（PR）の記載事項
PRを作成する際は、以下の内容を記載してください。

- 変更の意図: なぜそのように分割・改名したのか（理由を言語化してください）。

- 工夫した点: 読みやすくするために意識したこと。

## 評価・フィードバック
提出されたPRに対して、メンターがコードレビューを行います.  
レビューでは、コードの綺麗さだけでなく、「なぜそのように直したのか」という意図が正しく説明できているかを重視します。

public enum API_EXTRATOR {
    IMDB("https://api.mocki.io/v2/549a5d8b", new IMDBContentExtractor()),
    NASA("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14", new NASAContentExtractor()),
    LINGUAGENS("http://localhost:8080/languages", new LinguagensContentExtractor());

    private String url;
    private ContentExtractor extrator;

    API_EXTRATOR(String url, ContentExtractor extractor){
        this.url = url;
        this.extrator = extractor;
    }

    public String getUrl(){
        return url;
    }

    public ContentExtractor getExtrator() {
        return extrator;
    }
}

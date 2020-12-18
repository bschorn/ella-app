package org.schorn.ella.app;

public class EllaApp implements ICache, IDBMS, IFile, ISearch, ITopic {

    ICache cache = Injector.get(ICache.class, new ICache.Default());
    IDBMS dbms = Injector.get(IDBMS.class, new IDBMS.Default());
    IFile file = Injector.get(IFile.class, new IFile.Default());
    ISearch search = Injector.get(ISearch.class, new ISearch.Default());
    ITopic topic = Injector.get(ITopic.class, new ITopic.Default());

    @Override
    public GetResponse get(GetRequest getRequest) {
        return null;
    }

    @Override
    public SetResponse set(SetRequest setRequest) {
        return null;
    }

    @Override
    public QueryResponse query(QueryRequest queryRequest) {
        return null;
    }

    @Override
    public PersistResponse persist(PersistRequest persistRequest) {
        return null;
    }

    @Override
    public ReadResponse read(ReadRequest fileReadRequest) {
        return null;
    }

    @Override
    public WriteResponse write(WriteRequest writeRequest) {
        return null;
    }

    @Override
    public SearchResponse search(SearchRequest searchRequest) {
        return null;
    }

    @Override
    public UploadResponse upload(UploadRequest uploadRequest) {
        return null;
    }

    @Override
    public PublishResponse publish(PublishRequest publishRequest) {
        return null;
    }

    @Override
    public SubscribeResponse subscribe(SubscribeRequest subscribeRequest) {
        return null;
    }
}

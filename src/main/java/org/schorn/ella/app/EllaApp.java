package org.schorn.ella.app;

import java.nio.charset.StandardCharsets;

/**
 *  The Ella App class is an amalgamation of all the Interfaces.
 *  Each interface will have its own instance but can share implementations.
 */
public class EllaApp implements ICache, IDBMS, IFile, ISearch, ITopic, IService, ICommitLog {

    ICache cache = Injector.get(ICache.class, new ICache.Default());
    IDBMS dbms = Injector.get(IDBMS.class, new IDBMS.Default());
    IFile file = Injector.get(IFile.class, new IFile.Default());
    ISearch search = Injector.get(ISearch.class, new ISearch.Default());
    ITopic topic = Injector.get(ITopic.class, new ITopic.Default());
    IService service = Injector.get(IService.class, new IService.Default());
    ICommitLog commitLog = Injector.get(ICommitLog.class, new ICommitLog.Default());

    @Override
    public IGetResponse get(GetRequest request) {
        return cache.get(request);
    }

    @Override
    public IAsyncGetResponse asyncGet(AsyncGetRequest request) {
        return cache.asyncGet(request);
    }

    @Override
    public ISetResponse set(SetRequest request) {
        return cache.set(request);
    }

    @Override
    public IAsyncSetResponse asyncSet(AsyncSetRequest request) {
        return cache.asyncSet(request);
    }

    @Override
    public IQueryResponse query(QueryRequest request) {
        return dbms.query(request);
    }

    @Override
    public IAsyncQueryResponse asyncQuery(AsyncQueryRequest queryRequest) {
        return dbms.asyncQuery(queryRequest);
    }

    @Override
    public IPersistResponse persist(PersistRequest request) {
        return dbms.persist(request);
    }

    @Override
    public IAsyncPersistResponse asyncPersist(AsyncPersistRequest request) {
        return dbms.asyncPersist(request);
    }

    /**
     *
     *  EllaApp ellaApp = new EllaApp();
     *  IFile.ReadRequest fileReadRequest = IFile.ReadRequest.builder()
     *          .what("tsdata/2020/10/04/ts-20200104.dat")
     *          .with(StandardCharsets.UTF_8)
     *          .build();
     *  IFile.IReadResponse response = ellaApp.read(fileReadRequest);
     *  if (response.getException().isPresent()) {
     *      throw response.getException().get();
     *  }
     *  String tsdata = response.toString();
     */
    @Override
    public IReadResponse read(ReadRequest request) {
        return file.read(request);
    }

    @Override
    public IAsyncReadResponse asyncRead(ReadRequest request) {
        return file.asyncRead(request);
    }

    @Override
    public IWriteResponse write(WriteRequest request) {
        return file.write(request);
    }

    @Override
    public IAsyncWriteResponse asyncWrite(WriteRequest request) {
        return file.asyncWrite(request);
    }

    @Override
    public ISearchResponse search(SearchRequest request) {
        return search.search(request);
    }

    @Override
    public IAsyncSearchResponse asyncSearch(AsyncSearchRequest request) {
        return search.asyncSearch(request);
    }

    @Override
    public IUploadResponse upload(UploadRequest request) {
        return search.upload(request);
    }

    @Override
    public IPublishResponse publish(PublishRequest request) {
        return topic.publish(request);
    }

    @Override
    public ISubscribeResponse subscribe(SubscribeRequest request) {
        return topic.subscribe(request);
    }

    @Override
    public ITailResponse tail(TailRequest request) {
        return commitLog.tail(request);
    }

    @Override
    public IAsyncTailResponse asyncTail(AsyncTailRequest request) {
        return commitLog.asyncTail(request);
    }

    @Override
    public IAppendResponse append(AppendRequest request) {
        return commitLog.append(request);
    }

    @Override
    public IServiceResponse service(ServiceRequest request) {
        return service.service(request);
    }

    @Override
    public IAsyncServiceResponse asyncService(AsyncServiceRequest request) {
        return service.asyncService(request);
    }
}

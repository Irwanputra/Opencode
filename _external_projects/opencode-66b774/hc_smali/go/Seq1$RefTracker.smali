.class public final Lgo/Seq1$RefTracker;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgo/Seq1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RefTracker"
.end annotation


# static fields
.field private static final REF_OFFSET:I = 0x2a


# instance fields
.field private final javaObjs:Lgo/Seq1$RefMap;

.field private final javaRefs:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private next:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2a

    iput v0, p0, Lgo/Seq1$RefTracker;->next:I

    new-instance v0, Lgo/Seq1$RefMap;

    invoke-direct {v0}, Lgo/Seq1$RefMap;-><init>()V

    iput-object v0, p0, Lgo/Seq1$RefTracker;->javaObjs:Lgo/Seq1$RefMap;

    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Lgo/Seq1$RefTracker;->javaRefs:Ljava/util/IdentityHashMap;

    return-void
.end method


# virtual methods
.method public declared-synchronized dec(I)V
    .registers 5

    monitor-enter p0

    if-gtz p1, :cond_1d

    :try_start_3
    # getter for: Lgo/Seq1;->log:Ljava/util/logging/Logger;
    invoke-static {}, Lgo/Seq1;->access$000()Ljava/util/logging/Logger;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dec request for Go object "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V
    :try_end_1b
    .catchall {:try_start_3 .. :try_end_1b} :catchall_5b

    monitor-exit p0

    return-void

    :cond_1d
    :try_start_1d
    sget-object v0, Lgo/Seq1;->nullRef:Lgo/Seq1$Ref;

    iget v0, v0, Lgo/Seq1$Ref;->refnum:I
    :try_end_21
    .catchall {:try_start_1d .. :try_end_21} :catchall_5b

    if-ne p1, v0, :cond_25

    monitor-exit p0

    return-void

    :cond_25
    :try_start_25
    iget-object v0, p0, Lgo/Seq1$RefTracker;->javaObjs:Lgo/Seq1$RefMap;

    invoke-virtual {v0, p1}, Lgo/Seq1$RefMap;->get(I)Lgo/Seq1$Ref;

    move-result-object v0

    if-eqz v0, :cond_44

    # operator-- for: Lgo/Seq1$Ref;->refcnt:I
    invoke-static {v0}, Lgo/Seq1$Ref;->access$110(Lgo/Seq1$Ref;)I

    # getter for: Lgo/Seq1$Ref;->refcnt:I
    invoke-static {v0}, Lgo/Seq1$Ref;->access$100(Lgo/Seq1$Ref;)I

    move-result v1

    if-gtz v1, :cond_42

    iget-object v1, p0, Lgo/Seq1$RefTracker;->javaObjs:Lgo/Seq1$RefMap;

    invoke-virtual {v1, p1}, Lgo/Seq1$RefMap;->remove(I)V

    iget-object p1, p0, Lgo/Seq1$RefTracker;->javaRefs:Ljava/util/IdentityHashMap;

    iget-object v0, v0, Lgo/Seq1$Ref;->obj:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_42
    .catchall {:try_start_25 .. :try_end_42} :catchall_5b

    :cond_42
    monitor-exit p0

    return-void

    :cond_44
    :try_start_44
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "referenced Java object is not found: refnum="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5b
    .catchall {:try_start_44 .. :try_end_5b} :catchall_5b

    :catchall_5b
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized get(I)Lgo/Seq1$Ref;
    .registers 5

    monitor-enter p0

    if-ltz p1, :cond_2c

    const/16 v0, 0x29

    if-ne p1, v0, :cond_b

    :try_start_7
    sget-object p1, Lgo/Seq1;->nullRef:Lgo/Seq1$Ref;
    :try_end_9
    .catchall {:try_start_7 .. :try_end_9} :catchall_43

    monitor-exit p0

    return-object p1

    :cond_b
    :try_start_b
    iget-object v0, p0, Lgo/Seq1$RefTracker;->javaObjs:Lgo/Seq1$RefMap;

    invoke-virtual {v0, p1}, Lgo/Seq1$RefMap;->get(I)Lgo/Seq1$Ref;

    move-result-object v0
    :try_end_11
    .catchall {:try_start_b .. :try_end_11} :catchall_43

    if-eqz v0, :cond_15

    monitor-exit p0

    return-object v0

    :cond_15
    :try_start_15
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown java Ref: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2c
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ref called with Go refnum "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_43
    .catchall {:try_start_15 .. :try_end_43} :catchall_43

    :catchall_43
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized inc(Ljava/lang/Object;)I
    .registers 5

    monitor-enter p0

    if-nez p1, :cond_7

    const/16 p1, 0x29

    monitor-exit p0

    return p1

    :cond_7
    :try_start_7
    instance-of v0, p1, Lgo/Seq1$Proxy;

    if-eqz v0, :cond_13

    check-cast p1, Lgo/Seq1$Proxy;

    invoke-interface {p1}, Lgo/Seq1$GoObject;->incRefnum()I

    move-result p1
    :try_end_11
    .catchall {:try_start_7 .. :try_end_11} :catchall_64

    monitor-exit p0

    return p1

    :cond_13
    :try_start_13
    iget-object v0, p0, Lgo/Seq1$RefTracker;->javaRefs:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_49

    iget v0, p0, Lgo/Seq1$RefTracker;->next:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_32

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lgo/Seq1$RefTracker;->next:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lgo/Seq1$RefTracker;->javaRefs:Ljava/util/IdentityHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_49

    :cond_32
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createRef overflow for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_49
    :goto_49
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lgo/Seq1$RefTracker;->javaObjs:Lgo/Seq1$RefMap;

    invoke-virtual {v1, v0}, Lgo/Seq1$RefMap;->get(I)Lgo/Seq1$Ref;

    move-result-object v1

    if-nez v1, :cond_5f

    new-instance v1, Lgo/Seq1$Ref;

    invoke-direct {v1, v0, p1}, Lgo/Seq1$Ref;-><init>(ILjava/lang/Object;)V

    iget-object p1, p0, Lgo/Seq1$RefTracker;->javaObjs:Lgo/Seq1$RefMap;

    invoke-virtual {p1, v0, v1}, Lgo/Seq1$RefMap;->put(ILgo/Seq1$Ref;)V

    :cond_5f
    invoke-virtual {v1}, Lgo/Seq1$Ref;->inc()V
    :try_end_62
    .catchall {:try_start_13 .. :try_end_62} :catchall_64

    monitor-exit p0

    return v0

    :catchall_64
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized incRefnum(I)V
    .registers 5

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lgo/Seq1$RefTracker;->javaObjs:Lgo/Seq1$RefMap;

    invoke-virtual {v0, p1}, Lgo/Seq1$RefMap;->get(I)Lgo/Seq1$Ref;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lgo/Seq1$Ref;->inc()V
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_25

    monitor-exit p0

    return-void

    :cond_e
    :try_start_e
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "referenced Java object is not found: refnum="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_25
    .catchall {:try_start_e .. :try_end_25} :catchall_25

    :catchall_25
    move-exception p1

    monitor-exit p0

    throw p1
.end method

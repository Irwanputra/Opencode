.class public abstract Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:Z

.field public くし〴〺ぅ:Z

.field public final げつ〴ぬぐ:[Ljava/lang/String;

.field public づざかべべ:I

.field public なぎぱいぢぎ:Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;

.field public びぐびあび:I


# direct methods
.method public varargs constructor <init>([Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Z

    iput-boolean v0, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->くし〴〺ぅ:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ:Lいいにぽつ/づざかべべ/げつ〴ぬぐ/げつ〴ぬぐ;

    iput-object p1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Ljava/lang/String;)V
    .registers 2

    .line 1
    monitor-enter p0

    const/4 p1, -0x1

    :try_start_2
    iput p1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->びぐびあび:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return-void

    :catchall_c
    move-exception p1

    monitor-exit p0
    :try_end_e
    .catchall {:try_start_2 .. :try_end_e} :catchall_c

    throw p1
.end method

.method public くし〴〺ぅ(Ljava/io/OutputStream;)V
    .registers 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    :goto_6
    iget-object v2, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ:[Ljava/lang/String;

    array-length v2, v2

    if-ge v1, v2, :cond_2b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ:[Ljava/lang/String;

    aget-object v3, v3, v1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " 2>&1"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_2b
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public abstract げつ〴ぬぐ(ILjava/lang/String;)V
.end method

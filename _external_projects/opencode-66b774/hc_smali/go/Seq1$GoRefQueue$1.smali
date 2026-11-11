.class public Lgo/Seq1$GoRefQueue$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgo/Seq1$GoRefQueue;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lgo/Seq1$GoRefQueue;


# direct methods
.method public constructor <init>(Lgo/Seq1$GoRefQueue;)V
    .registers 2

    iput-object p1, p0, Lgo/Seq1$GoRefQueue$1;->this$0:Lgo/Seq1$GoRefQueue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    :catch_0
    :goto_0
    :try_start_0
    iget-object v0, p0, Lgo/Seq1$GoRefQueue$1;->this$0:Lgo/Seq1$GoRefQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    move-result-object v0

    check-cast v0, Lgo/Seq1$GoRef;

    iget-object v1, p0, Lgo/Seq1$GoRefQueue$1;->this$0:Lgo/Seq1$GoRefQueue;

    # getter for: Lgo/Seq1$GoRefQueue;->refs:Ljava/util/Collection;
    invoke-static {v1}, Lgo/Seq1$GoRefQueue;->access$200(Lgo/Seq1$GoRefQueue;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    iget v1, v0, Lgo/Seq1$GoRef;->refnum:I

    invoke-static {v1}, Lgo/Seq1;->destroyRef(I)V

    invoke-virtual {v0}, Ljava/lang/ref/PhantomReference;->clear()V
    :try_end_19
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_19} :catch_0

    goto :goto_0
.end method

.class public Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private count:I

.field private start:I

.field public final synthetic this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .registers 5

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-virtual {v0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->cancelHighlighterRender()V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-virtual {v0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->getSyntaxPatternsSize()I

    move-result v0

    if-lez v0, :cond_48

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->start:I

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->count:I

    # invokes: Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->convertTabs(Landroid/text/Editable;II)V
    invoke-static {v0, p1, v1, v2}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->access$400(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;Landroid/text/Editable;II)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    # getter for: Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->modified:Z
    invoke-static {p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->access$000(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)Z

    move-result p1

    if-nez p1, :cond_1f

    return-void

    :cond_1f
    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    const/4 v0, 0x1

    # setter for: Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->dirty:Z
    invoke-static {p1, v0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->access$502(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;Z)Z

    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    # getter for: Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateHandler:Landroid/os/Handler;
    invoke-static {p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->access$800(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    # getter for: Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateRunnable:Ljava/lang/Runnable;
    invoke-static {v0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->access$600(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)Ljava/lang/Runnable;

    move-result-object v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    # getter for: Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateDelayTime:I
    invoke-static {v1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->access$700(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    # getter for: Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mRemoveErrorsWhenTextChanged:Z
    invoke-static {p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->access$900(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)Z

    move-result p1

    if-eqz p1, :cond_48

    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-virtual {p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->removeAllErrorLines()V

    :cond_48
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .registers 5

    iput p2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->start:I

    iput p4, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;->count:I

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .registers 5

    return-void
.end method

.class public Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$2;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$2;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$2;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    # invokes: Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->highlightWithoutChange(Landroid/text/Editable;)V
    invoke-static {v1, v0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->access$300(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;Landroid/text/Editable;)V

    return-void
.end method

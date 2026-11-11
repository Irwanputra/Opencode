.class public Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/InputFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->initEditorView()V
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

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$1;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .registers 8

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$1;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    # getter for: Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->modified:Z
    invoke-static {v0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->access$000(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)Z

    move-result v0

    if-eqz v0, :cond_26

    sub-int/2addr p3, p2

    const/4 v0, 0x1

    if-ne p3, v0, :cond_26

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-ge p2, p3, :cond_26

    invoke-interface {p4}, Landroid/text/Spanned;->length()I

    move-result p3

    if-ge p5, p3, :cond_26

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p2

    const/16 p3, 0xa

    if-ne p2, p3, :cond_26

    iget-object p2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$1;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    # invokes: Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->autoIndent(Ljava/lang/CharSequence;Landroid/text/Spanned;II)Ljava/lang/CharSequence;
    invoke-static {p2, p1, p4, p5, p6}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->access$100(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;Ljava/lang/CharSequence;Landroid/text/Spanned;II)Ljava/lang/CharSequence;

    move-result-object p1

    :cond_26
    return-object p1
.end method

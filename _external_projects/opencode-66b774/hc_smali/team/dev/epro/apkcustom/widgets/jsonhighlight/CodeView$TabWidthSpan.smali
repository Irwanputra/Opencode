.class public final Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$TabWidthSpan;
.super Landroid/text/style/ReplacementSpan;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "TabWidthSpan"
.end annotation


# instance fields
.field public final synthetic this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;


# direct methods
.method private constructor <init>(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$TabWidthSpan;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$1;)V
    .registers 3

    invoke-direct {p0, p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$TabWidthSpan;-><init>(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .registers 10

    return-void
.end method

.method public getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .registers 6

    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$TabWidthSpan;->this$0:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    # getter for: Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->tabWidth:I
    invoke-static {p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->access$1000(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)I

    move-result p1

    return p1
.end method

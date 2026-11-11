.class public Lteam/dev/epro/apkcustom/widgets/CustomTextView$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/widgets/CustomTextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Ljava/lang/CharSequence;

.field public final synthetic くし〴〺ぅ:Landroid/widget/TextView$BufferType;

.field public final synthetic びぐびあび:Lteam/dev/epro/apkcustom/widgets/CustomTextView;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/widgets/CustomTextView;Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    .registers 4

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/CustomTextView$げつ〴ぬぐ;->びぐびあび:Lteam/dev/epro/apkcustom/widgets/CustomTextView;

    iput-object p2, p0, Lteam/dev/epro/apkcustom/widgets/CustomTextView$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/CharSequence;

    iput-object p3, p0, Lteam/dev/epro/apkcustom/widgets/CustomTextView$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/widget/TextView$BufferType;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 4

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/CustomTextView$げつ〴ぬぐ;->びぐびあび:Lteam/dev/epro/apkcustom/widgets/CustomTextView;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/CustomTextView$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/CharSequence;

    iget-object v2, p0, Lteam/dev/epro/apkcustom/widgets/CustomTextView$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/widget/TextView$BufferType;

    invoke-virtual {v0, v1, v2}, Lteam/dev/epro/apkcustom/widgets/CustomTextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    return-void
.end method
